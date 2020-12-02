package com.solt.jdc.annotationcontrollermethod.ds;

public class MutableCountHolder {

    private int count;

    public int getCount() {
        return count;
    }

    public int increment() {
        return ++count;
    }
}
