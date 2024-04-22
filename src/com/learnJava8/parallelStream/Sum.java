package com.learnJava8.parallelStream;

public class Sum {

    private int total;

    public void performSum(int val) {
        this.total = this.total + val;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
