package ca.shubbar.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author Mustafa <codingbox@outlook.com>
 * Created at 2021-08-12
 */

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello there!!");
        return "Hi There!";
    }
}
