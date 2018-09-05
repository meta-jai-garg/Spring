package com.metacube.training.bean_scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"bean_scope.xml");
		
		System.out.println("--------------------- Singleton Scope ----------------------");
		
		Person personSingleton = (Person) context.getBean("personSingleton");
		personSingleton.setName("ABC");
		System.out.println(personSingleton.getName());

		Person personSingletonAnother = (Person) context
				.getBean("personSingleton");
		personSingletonAnother.setName("XYZ");
		System.out.println(personSingletonAnother.getName());
		
		// will print "XYZ" because name is override by personSingletonAnother.setName("XYZ");
		System.out.println(personSingleton.getName());
		
		System.out.println();
		System.out.println("--------------------- Prototype Scope ----------------------");
		
		Person personPrototype = (Person) context.getBean("personPrototype");
		personPrototype.setName("ABC");
		System.out.println(personPrototype.getName());

		Person personPrototypeAnother = (Person) context
				.getBean("personSingleton");
		personPrototypeAnother.setName("XYZ");
		System.out.println(personPrototypeAnother.getName());
		System.out.println(personPrototype.getName());
	}
}
