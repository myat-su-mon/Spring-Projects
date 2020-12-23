package com.example.authenticationserverdemo.repositories;

import com.example.authenticationserverdemo.entities.Otp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OtpRepository extends JpaRepository<Otp, String> {

    Optional<Otp> findOtpByUsername(String username);
}
