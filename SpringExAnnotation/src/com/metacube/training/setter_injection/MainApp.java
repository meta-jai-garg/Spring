package com.metacube.training.setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"setter_injection.xml");
		TextEditor textEditor = (TextEditor) context
				.getBean("textEditorSetter");
		textEditor.spellCheck();
	}
}
