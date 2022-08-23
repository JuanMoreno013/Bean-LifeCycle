package com.example.BeanCycle;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

    private final Logger logger = Logger.getLogger(BeanCycleApplication.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        if (bean instanceof MyBean) {
            logger.info("--- postProcessBeforeInitialization executed ---" +bean.getClass().getSimpleName());
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        if (bean instanceof MyBean) {
            logger.info("--- postProcessAfterInitialization executed ---" + bean.getClass().getSimpleName());
        }
        return bean;
    }
}
