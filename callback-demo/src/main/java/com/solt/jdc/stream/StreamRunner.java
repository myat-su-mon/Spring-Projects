package com.solt.jdc.stream;

import java.util.stream.Stream;

public class StreamRunner {
    public static void main(String[] args) {
        new StreamRunner().run();
    }

    private void run() {
        Stream.iterate(
                2L, this::getNext)
                .limit(5)
                .map(this::formatNumber)
                .forEach(System.out::println);
    }

    private long getNext(long i){
        return (long) i + 1;
    }

    private String formatNumber(long n){
        return String.format("Number = %d ", n);
    }
}
