package com.vikmir.exeptions;

/**
 * Exception thrown when asked for non-existing bean
 */

public class NoSuchBeanException extends BeansException {

    private final String beanName;

    /**
     * Create a new {@code NoSuchBeanException}.
     *
     * @param type
     * @param name the name of the missing bean
     */
    public NoSuchBeanException(Class<?> type, String name) {
        super("No bean named '" + name + "' available");
        this.beanName = name;
    }
    
}

