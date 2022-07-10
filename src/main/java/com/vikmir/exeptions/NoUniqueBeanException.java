package com.vikmir.exeptions;

import com.vikmir.util.StringUtils;

import java.util.Collection;

/**
 * Exception thrown when a BeanFactory is asked for a bean instance for which multiple matching candidates have been found when only one matching bean was expected.
 */
public class NoUniqueBeanException extends NoSuchBeanException {

    private final int numberOfBeansFound;
    private final Collection<String> beanNamesFound;

    /**
     * Create a new {@code NoUniqueBeanDefinitionException}.
     * @param type required type of the non-unique bean
     * @param beanNamesFound the names of all matching beans (as a Collection)
     */
    public NoUniqueBeanException(Class<?> type, Collection<String> beanNamesFound) {
        super(type, "expected single matching bean but found " + beanNamesFound.size() + ": " +
                StringUtils.collectionToDelimitedString(beanNamesFound, ",", "", ""));
        this.numberOfBeansFound = beanNamesFound.size();
        this.beanNamesFound = beanNamesFound;
    }
}