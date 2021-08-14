package ca.shubbar.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Mustafa <codingbox@outlook.com>
 * Created at 2021-08-13
 */

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "EN - Hello World";
    }
}
