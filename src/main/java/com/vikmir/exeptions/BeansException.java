package com.vikmir.exeptions;

/**
 * Abstract superclass for all exceptions with beans
 */
public abstract class BeansException extends Exception {

    /**
     * Create a new BeansException with the specified message.
     *
     * @param msg the detail message
     */
    public BeansException(String msg) {
        super(msg);
    }

}