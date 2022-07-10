package com.vikmir.exeption;

public class NoUniqueBeanException extends RuntimeException {

    public NoUniqueBeanException(String type, int beanNamesFound) {
        super("Expected single matching bean with type " + type + " but found: " + beanNamesFound);
    }

}