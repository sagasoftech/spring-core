package com.examples.autowire;

public class TextEditor {
	private SpellChecker spellChecker;
	private String name;

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		System.out.println("Inside getName of TextEditor.");
		return name;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}