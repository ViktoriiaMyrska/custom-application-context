package com.vikmir.exeption;

public class NoSuchBeanException extends RuntimeException {

    public NoSuchBeanException(String name) {
        super("No bean named '" + name + "' available");
    }
    
}

