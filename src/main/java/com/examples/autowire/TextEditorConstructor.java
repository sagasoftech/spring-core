package com.examples.autowire;

public class TextEditorConstructor {
	private SpellChecker spellChecker;
	private String name;

	public TextEditorConstructor(SpellChecker spellChecker, String name) {
		this.spellChecker = spellChecker;
		this.name = name;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public String getName() {
		System.out.println("Inside getName of TextEditorConstructor.");
		return name;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
