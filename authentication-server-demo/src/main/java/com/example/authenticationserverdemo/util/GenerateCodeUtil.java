package com.example.authenticationserverdemo.util;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public final class GenerateCodeUtil {

    private GenerateCodeUtil(){}

    public static String generateCode(){
        String code;
        try {
            SecureRandom random = SecureRandom.getInstanceStrong();
            code = String.valueOf(random.nextInt(9000)+1000); // between 1000 and 8999
            return code;
        }catch (NoSuchAlgorithmException e){
            throw new RuntimeException("Problem when generating the random code.");
        }
    }
}
