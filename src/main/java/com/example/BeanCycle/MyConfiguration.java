package com.example.BeanCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public MyBean mySpringBean(){
        return new MyBean();
    }

}
