package com.kodilla.rps;

public class WrongMoveException extends RuntimeException {
    public WrongMoveException(String message) {
        super(message);
    }
}
