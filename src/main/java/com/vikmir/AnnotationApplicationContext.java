package com.vikmir;

import com.vikmir.exeption.NoSuchBeanException;
import com.vikmir.exeption.NoUniqueBeanException;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AnnotationApplicationContext implements ApplicationContext {

    private final Map<String, Object> context = new HashMap<>();

    @SneakyThrows
    public AnnotationApplicationContext(String packageName) {
        Reflections reflections = new Reflections(packageName);
        Set<Class<?>> beans = reflections.getTypesAnnotatedWith(Bean.class);
        for (Class<?> bean : beans) {
            String beanValue = bean.getAnnotation(Bean.class).value();
            String name = beanName(beanValue, bean.getSimpleName());
            Object instance = bean.getDeclaredConstructor().newInstance();
            context.put(name, instance);
        }
    }

    private String beanName(String beanValue, String name) {
        String beanName = name.substring(0, 1).toLowerCase() + name.substring(1);
        return beanValue.equals("") ? beanName : beanValue;
    }

    @Override
    public <T> T getBean(Class<T> beanType) throws NoSuchBeanException, NoUniqueBeanException {
        var beans = context.values()
                .stream()
                .filter(bean -> beanType.isAssignableFrom(bean.getClass()))
                .toList();
        if (beans.isEmpty()) {
            throw new NoSuchBeanException(beanType.getSimpleName());
        }
        if (beans.size() > 1) {
            throw new NoUniqueBeanException(beanType.getTypeName(), beans.size());
        }
        return beanType.cast(beans.get(0));
    }

    @Override
    public <T> T getBean(String name, Class<T> beanType) throws NoSuchBeanException {
        var beans = context.entrySet()
                .stream()
                .filter(entry -> beanType.isAssignableFrom(entry.getValue().getClass()))
                .filter(entry -> entry.getKey().equals(name))
                .toList();

        if (beans.isEmpty()) {
            throw new NoSuchBeanException(beanType.getSimpleName());
        }
        return beanType.cast(beans.get(0));
    }

    @Override
    public <T> Map<String, T> getAllBeans(Class<T> beanType) {
        return context.entrySet()
                .stream()
                .filter(entry -> beanType.isAssignableFrom(entry.getValue().getClass()))
                .collect(Collectors.toMap((Map.Entry::getKey), entry -> beanType.cast(entry.getValue())));
    }

}