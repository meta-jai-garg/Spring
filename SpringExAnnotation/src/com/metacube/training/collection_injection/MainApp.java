package com.metacube.training.collection_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"collection_injection.xml");
		CollectionInjection injection = (CollectionInjection) context
				.getBean("collectionInjection");
		injection.getListCollection();
		injection.getSetCollection();
		injection.getMapCollection();
	}
}
