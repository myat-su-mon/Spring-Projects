package com.solt.jdc.custom.expression;

public class AddExpressionEvaluator implements ExpressionEvaluator{
    @Override
    public int evaluate(int a, int b) {
        return a + b;
    }
}
