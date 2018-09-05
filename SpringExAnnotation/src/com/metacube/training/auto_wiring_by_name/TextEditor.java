package com.metacube.training.auto_wiring_by_name;

public class TextEditor {
	private SpellChecker spellCheckerAutoWireName;
	private String name;

	public SpellChecker getSpellCheckerAutoWireName() {
		return spellCheckerAutoWireName;
	}

	public void setSpellCheckerAutoWireName(
			SpellChecker spellCheckerAutoWireName) {
		this.spellCheckerAutoWireName = spellCheckerAutoWireName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void spellCheck() {
		spellCheckerAutoWireName.checkSpelling();
	}
}