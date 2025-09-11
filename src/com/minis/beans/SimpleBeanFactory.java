package com.minis.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleBeanFactory implements BeanFactory{
    private List<BeanDefinition> beanDefinitions = new ArrayList<>();
    private List<String> beanNames = new ArrayList<>();
    private Map<String, Object> singletons = new HashMap<>();
    
    public SimpleBeanFactory() {}

    @Override
    public Object getBean(String beanName) throws NoSuchBeanDefinitionException {
        Object singleton = singletons.get(beanName);
        if (singleton != null){
            int i = beanNames.indexOf(beanName);
            if(i==-1){
                throw new NoSuchBeanDefinitionException();
            }else {
                BeanDefinition bd = beanDefinitions.get(i);
            }
        }
        return null;
    }

    @Override
    public void registerBeanDefinition(BeanDefinition bd) {

    }
}
