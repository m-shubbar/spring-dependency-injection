package ca.shubbar.dependencyinjection.services;

/**
 * @author Mustafa <codingbox@outlook.com>
 * Created at 2021-08-13
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
