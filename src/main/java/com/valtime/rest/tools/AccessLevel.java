package com.valtime.rest.tools;

public enum AccessLevel {
    ROOT("all"),
    ADMIN("write/read"),
    USER("readonly");

    public final String label;

    private AccessLevel(String label){
        this.label = label;
    }
}
