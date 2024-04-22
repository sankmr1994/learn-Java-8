package com.learnJava8.defaultMethod;

public interface B {

    default void m() {
        System.out.println("Inside Interface B");
    }
}
