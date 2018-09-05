package com.metacube.training.auto_wiring_by_name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"auto_wire_by_name.xml");
		TextEditor textEditor = (TextEditor) context
				.getBean("textEditorAutoWireName");
		textEditor.spellCheck();
	}
}
