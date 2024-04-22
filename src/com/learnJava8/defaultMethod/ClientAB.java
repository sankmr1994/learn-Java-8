package com.learnJava8.defaultMethod;

public class ClientAB implements A, B {
    @Override
    public void m() {
        B.super.m();
    }

    public static void main(String[] args) {
        ClientAB ab = new ClientAB();
        ab.m();
    }
}
