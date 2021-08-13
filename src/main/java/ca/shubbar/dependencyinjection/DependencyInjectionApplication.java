package ca.shubbar.dependencyinjection;

import ca.shubbar.dependencyinjection.controllers.ConstructorInjectorController;
import ca.shubbar.dependencyinjection.controllers.MyController;
import ca.shubbar.dependencyinjection.controllers.PropertyInjectedController;
import ca.shubbar.dependencyinjection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(DependencyInjectionApplication.class, args);

		// Bean name is the class starting with small letter
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);

		// Property
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println("From property DI: " + propertyInjectedController.getGreeting());


		// Setter
		SetterInjectedController setterInjectedController =
				(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println("From setter DI: " + setterInjectedController.getGreeting());

		// Constructor
		ConstructorInjectorController constructorInjectorController =
				(ConstructorInjectorController) ctx.getBean("constructorInjectorController");
		System.out.println("From constructor DI: " + constructorInjectorController.getGreeting());

	}

}
