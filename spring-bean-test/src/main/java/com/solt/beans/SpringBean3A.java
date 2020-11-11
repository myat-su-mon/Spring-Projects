package com.solt.beans;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;

public class SpringBean3A implements SpringBean3{

    private final MessageDigest messageDigest;

    public SpringBean3A(MessageDigest messageDigest) {
        this.messageDigest = messageDigest;
    }

    public void printHash() {
        byte[] hashByte = messageDigest.digest("test".getBytes());
        char[] hashString = Hex.encodeHex(hashByte);
        System.out.println(hashString);
    }
}
