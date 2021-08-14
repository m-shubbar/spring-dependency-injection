package ca.shubbar.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Mustafa <codingbox@outlook.com>
 * Created at 2021-08-13
 */

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - from the Primary Bean";
    }
}
