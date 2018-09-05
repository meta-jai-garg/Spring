package com.metacube.training.auto_wiring_auto_detect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"auto_wire_by_auto_detect.xml");
		TextEditor textEditor = (TextEditor) context.getBean("textEditor");
		textEditor.spellCheck();
	}
}
