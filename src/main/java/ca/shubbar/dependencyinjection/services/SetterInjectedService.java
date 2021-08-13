package ca.shubbar.dependencyinjection.services;

import org.springframework.stereotype.Service;

/**
 * @author Mustafa <codingbox@outlook.com>
 * Created at 2021-08-13
 */
@Service
public class SetterInjectedService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
