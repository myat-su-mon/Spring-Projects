package com.jdc.value.bean;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.SpelCompilerMode;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Runner4 {
    public static void main(String[] args) {
        ExpressionParser parser =new SpelExpressionParser(
            new SpelParserConfiguration(SpelCompilerMode.IMMEDIATE, Runner4.class.getClassLoader())
        );
        System.out.println(parser.parseExpression("'Hello'.concat('World')").getValue());
        System.out.println(parser.parseExpression("'2 + 2 equals '.concat(2+2)").getValue());
        System.out.println(parser.parseExpression("new String('Wall Street').toUpperCase()").getValue());
    }
}
