package com.example.authenticationserverdemo.service;

import com.example.authenticationserverdemo.entities.Otp;
import com.example.authenticationserverdemo.entities.User;
import com.example.authenticationserverdemo.repositories.OtpRepository;
import com.example.authenticationserverdemo.repositories.UserRepository;
import com.example.authenticationserverdemo.util.GenerateCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UserService {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OtpRepository otpRepository;

    public void addUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public void auth(User user) {
        Optional<User> o = userRepository.findUserByUsername(user.getUsername());
        if (o.isPresent()) { // user exists
            User u = o.get();
            if (passwordEncoder.matches(user.getPassword(), u.getPassword())){
                renewOtp(u);
            }else {
                throw new BadCredentialsException("Bad Credentials.");
            }
        }else { // user does not exist
            throw new BadCredentialsException("Bad Credentials.(User does not exist)");
        }
    }

    public boolean check(Otp otpToValidate){
        Optional<Otp> userOtp = otpRepository.findOtpByUsername(otpToValidate.getUsername());
        if (userOtp.isPresent()) {
            Otp otp = userOtp.get();
            if (otpToValidate.getCode().equals(otp.getCode())){
                return true;
            }
        }
        return false;
    }

    private void renewOtp(User u) {
        String code = GenerateCodeUtil.generateCode();
        Optional<Otp> userOtp = otpRepository.findOtpByUsername(u.getUsername());
        if (userOtp.isPresent()) { // if OTP exists for this username
            Otp otp = userOtp.get();
            otp.setCode(code);
        } else  { // otp does not exist for this username
            Otp otp = new Otp();
            otp.setUsername(u.getUsername());
            otp.setCode(code);
            otpRepository.save(otp);
        }
    }
}
