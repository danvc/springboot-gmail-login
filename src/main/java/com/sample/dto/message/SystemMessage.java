package com.sample.dto.message;

public class SystemMessage {
    private String message;

    public SystemMessage() {
    }

    public SystemMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
