package com.jdc.value.bean;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.Arrays;

public class Runner2 {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        System.out.println(parser.parseExpression("'Hello'.concat('World')").getValue());
        System.out.println(parser.parseExpression("'2 + 2 equals '.concat(2+2)").getValue());
        System.out.println(parser.parseExpression("new String('Wall Street').toUpperCase()").getValue());
        System.out.println(parser.parseExpression("24 * 60").getValue());
        System.out.println(parser.parseExpression("{1, 2, 3}").getValue());
        System.out.println(parser.parseExpression("{a:1, b:2, c:3}").getValue());
        System.out.println(Arrays.toString((int[])parser.parseExpression("new int[]{1,2,3}").getValue()));
        System.out.println(parser.parseExpression("3 < 10").getValue());
    }
}
