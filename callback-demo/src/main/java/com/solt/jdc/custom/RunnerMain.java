package com.solt.jdc.custom;

import com.solt.jdc.custom.evaluator.NumberEvaluator;
import com.solt.jdc.custom.expression.AddExpressionEvaluator;
import com.solt.jdc.custom.expression.ExpressionEvaluator;
import com.solt.jdc.custom.expression.MinusExpressionEvaluator;
import com.solt.jdc.custom.printer.DecoratedValuePrinter;
import com.solt.jdc.custom.printer.StandardValuePrinter;
import com.solt.jdc.custom.printer.ValuePrinter;

public class RunnerMain {
    public static void main(String[] args) {
        // ExpressionEvaluator expressionEvaluator = new MinusExpressionEvaluator();
        /* ExpressionEvaluator expressionEvaluator = new ExpressionEvaluator() {
            @Override
            public int evaluate(int a, int b) {
                return a*b;
            }
        };*/

        // ExpressionEvaluator expressionEvaluator = (a,b) -> a - b;

        // ExpressionEvaluator expressionEvaluator = RunnerMain::powerEvaluator;

        ExpressionEvaluator expressionEvaluator = Integer::sum;

        ValuePrinter valuePrinter = new DecoratedValuePrinter();

        NumberEvaluator numberEvaluator = new NumberEvaluator();

        numberEvaluator.evaluate(4, expressionEvaluator, valuePrinter);
    }

    private static int powerEvaluator(int a, int b){
        return (int)Math.pow(a,b);
    }
}
