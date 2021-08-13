package ca.shubbar.dependencyinjection.controllers;

import ca.shubbar.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author Mustafa <codingbox@outlook.com>
 * Created at 2021-08-13
 */


@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Qualifier("setterInjectedService")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
