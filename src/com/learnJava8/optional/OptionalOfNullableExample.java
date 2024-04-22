package com.learnJava8.optional;

import java.util.Optional;

public class OptionalOfNullableExample {

    private static Optional<String> ofNullableExample() {
        return Optional.ofNullable("Hello");
    }

    private static Optional<String> emptyExample() {
        return Optional.empty();
    }

    private static Optional<String> ofExample() {
        return Optional.of(null);
    }


    public static void main(String[] args) {
        System.out.println(ofNullableExample().isPresent());
        System.out.println(emptyExample().isPresent());
        System.out.println(ofExample().isPresent());
    }
}
