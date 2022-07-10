package com.vikmir;

import com.vikmir.exeption.NoSuchBeanException;
import com.vikmir.exeption.NoUniqueBeanException;

import java.util.Map;

public interface ApplicationContext {

    /**
     * Returns a bean by its type
     */
    <T> T getBean(Class<T> beanType) throws NoSuchBeanException, NoUniqueBeanException;

    /**
     * Returns a bean by its name
     */
    <T> T getBean(String name, Class<T> beanType) throws NoSuchBeanException;

    /**
     * Returns a map of beans where the key is it’s name and the value is the bean
     */
    <T> Map<String, T> getAllBeans(Class<T> beanType);

}