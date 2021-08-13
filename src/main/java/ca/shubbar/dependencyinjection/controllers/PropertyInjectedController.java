package ca.shubbar.dependencyinjection.controllers;

import ca.shubbar.dependencyinjection.services.GreetingService;

/**
 * @author Mustafa <codingbox@outlook.com>
 * Created at 2021-08-13
 */

// Least preferred method

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
