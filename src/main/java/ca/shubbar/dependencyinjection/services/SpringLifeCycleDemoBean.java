package ca.shubbar.dependencyinjection.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Mustafa <codingbox@outlook.com>
 * Created at 2021-08-14
 */

// Good to know, events we can hook into during Spring lifecycle

@Component
public class SpringLifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## setBeanFactory(BeanFactory beanFactory) -> Bean has been set.");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## setBeanName(String s) -> My bean Name is: " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## destroy() -> Lifecycle bean has been terminated.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## afterPropertiesSet() -> Lifecycle bean has its properties set.");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## setApplicationContext(ApplicationContext applicationContext) -> " +
                "Application context has been set.");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## postConstruct() -> The post construct annotated method has been called.");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## preDestroy() -> The Predestroy annotated method has been called.");
    }

    public void beforeInit(){
        System.out.println("## beforeInit() -> Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## afterInit() -> After init called by Bean Post Processor");
    }
}
