package com.example.BeanCycle;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyBean implements BeanNameAware, ApplicationContextAware,
        InitializingBean, DisposableBean {

    private final Logger logger = Logger.getLogger("Bean");

    public MyBean() {
        logger.info("--- Bean Created ---");
    }

    @Override
    public void setBeanName(String s) {
        logger.info("--- Set BeanName executed ---");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        logger.info("--- Set ApplicationContext executed ---");
    }


    @PostConstruct
    public void postConstruct() {
        logger.info("--- @PostConstruct executed ---");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("--- After PropertiesSet executed ---");
    }

    public void initMethod() {
        logger.info("--- Init-method executed ---");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("--- @PreDestroy executed ---");
    }

    @Override
    public void destroy() throws Exception {
        logger.info("--- Destroy executed ---");
    }

    public void destroyMethod() {
        logger.info("--- Destroy-method executed ---");
    }

}
