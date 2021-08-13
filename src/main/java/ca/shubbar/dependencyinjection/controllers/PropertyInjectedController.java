package ca.shubbar.dependencyinjection.controllers;

import ca.shubbar.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author Mustafa <codingbox@outlook.com>
 * Created at 2021-08-13
 */

// Least preferred method
@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")

    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
