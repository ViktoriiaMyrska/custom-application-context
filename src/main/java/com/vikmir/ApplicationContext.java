package com.vikmir;
//Required part: custom Application Context
//        Create an interface ApplicationContext with the following API
//        getBean(Class<T> beanType) – returns a bean by its type,
//        it should throw NoSuchBeanException if nothing is found
//        it should throw NoUniqueBeanException if more than one bean is found
//        getBean(String name, Class<T> beanType) – returns a bean by its name
//        it should throw NoSuchBeanException if nothing is found
//        getAllBeans(Class<T> beanType) – returns a map of beans where the key is it’s name and the value is the bean
//        Create a custom annotation (like @Bean )
//        Create an implementation of the ApplicationContext that accepts a package name as a constructor parameter
//        Scan the package to find all classes annotated with @Bean
//Create instances of those classes
//        Resolve a name for each bean
//        If annotation has name like this @Bean("coolBean") – use "coolBean"
//        Otherwise, use class name with the lowercased first letter. E.g. for PrinterService class – use "printerService"
//        Store created object by its name in the application context
//        Make sure it works
//        Publish your code to the GitHub
//        Post a link as a response to this message

import com.vikmir.exeptions.NoSuchBeanException;
import com.vikmir.exeptions.NoUniqueBeanException;

import java.util.Map;

public interface ApplicationContext <T> {

//    returns a bean by its type
    T getBean(Class<T> beanType) throws NoSuchBeanException, NoUniqueBeanException;

//    returns a bean by its name
    T getBean(String name, Class<T> beanType) throws NoSuchBeanException;

//    returns a map of beans where the key is it’s name and the value is the bean
    Map<String, T> getAllBeans(Class<T> beanType);

}
