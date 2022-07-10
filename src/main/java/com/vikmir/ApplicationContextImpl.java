package com.vikmir;

import com.vikmir.exeptions.NoSuchBeanException;
import com.vikmir.exeptions.NoUniqueBeanException;

import java.util.Map;

public class ApplicationContextImpl<T> implements ApplicationContext<T> {

    private final String packageName;

    public ApplicationContextImpl(String packageName) {
        this.packageName = packageName;
    }

    @Override
    public T getBean(Class<T> beanType) throws NoSuchBeanException, NoUniqueBeanException {
        return null;
    }

    @Override
    public T getBean(String name, Class<T> beanType) throws NoSuchBeanException {
        return null;
    }

    @Override
    public Map<String, T> getAllBeans(Class<T> beanType) {
        return null;
    }
}
