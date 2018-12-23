package com.shoppinghp.exception;

public class ShoppingException extends Exception {
    private static final int SPException = 1000;

    public ShoppingException(String message) {
        super(message);
    }
}
