package com.metacube.training.auto_wiring_auto_detect;

public class TextEditor {
	private SpellChecker spellChecker;
	private String name;

	public TextEditor() {
		super();
	}

	public TextEditor(SpellChecker spellChecker, String name) {
		this.spellChecker = spellChecker;
		this.name = name;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public String getName() {
		return name;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}