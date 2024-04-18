package com.cydeo.enums;

public enum Status {

    OPEN("Open"),IN_PROGRESS("In_progress"),COMPLETE("Completed");

    private final String value;

    public String getValue() {
        return value;
    }

    Status(String value) {
        this.value=value;
    }
}
