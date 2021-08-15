package ca.shubbar.dependencyinjection.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Mustafa <codingbox@outlook.com>
 * Created at 2021-08-14
 */

@Component
public class SpringCustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof SpringLifeCycleDemoBean) {
            ((SpringLifeCycleDemoBean) bean).beforeInit();
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof SpringLifeCycleDemoBean) {
            ((SpringLifeCycleDemoBean) bean).afterInit();
        }

        return bean;
    }
}
