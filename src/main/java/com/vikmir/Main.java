package com.vikmir;

import com.vikmir.beans.Cat;
import com.vikmir.entities.User;
import com.vikmir.exeptions.NoSuchBeanException;

public class Main {

    public static void main(String[] args) throws NoSuchBeanException {
        ApplicationContext context = new ApplicationContextImpl("com.vikmir.beans");
        Object catBean = context.getBean(Cat.class);
        Object userBean = context.getBean(User.class);
        System.out.println(catBean);
        System.out.println(userBean);
    }

}