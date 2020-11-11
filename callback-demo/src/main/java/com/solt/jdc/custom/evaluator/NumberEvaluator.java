package com.solt.jdc.custom.evaluator;

import com.solt.jdc.custom.ds.Pair;
import com.solt.jdc.custom.expression.ExpressionEvaluator;
import com.solt.jdc.custom.printer.ValuePrinter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberEvaluator {
    public void evaluate(int n, ExpressionEvaluator expressionEvaluator, ValuePrinter valuePrinter){
        List<Pair> numberPairs = generatePairs(n);
        for(Pair numberPair : numberPairs){
            valuePrinter.print(
                    expressionEvaluator.evaluate(numberPair.getA(), numberPair.getB())
            );
        }
    }

    private List<Pair> generatePairs(int n) {
        return IntStream.range(1,n+1)
                .mapToObj(i -> new Pair(i, 2*i))
                .collect(Collectors.toList());
    }
}
