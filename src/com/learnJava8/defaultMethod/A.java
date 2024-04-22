package com.learnJava8.defaultMethod;

public interface A {

    default void m() {
        System.out.println("Inside Interface A");
    }
}
