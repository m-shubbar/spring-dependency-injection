package ca.shubbar.dependencyinjection.controllers;

import ca.shubbar.dependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author Mustafa <codingbox@outlook.com>
 * Created at 2021-08-12
 */

@Controller
public class MyController {

    private final GreetingService greetingService;
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
