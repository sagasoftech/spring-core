package com.examples.dependencyinjection;

public class TextEditor3 {
	private SpellChecker spellChecker3;

	// a setter method to inject the dependency.
	public void setSpellChecker3(SpellChecker spellChecker3) {
		System.out.println("Inside setSpellChecker3.");
		this.spellChecker3 = spellChecker3;
	}

	// a getter method to return spellChecker
	public SpellChecker getSpellChecker3() {
		return spellChecker3;
	}

	public void spellCheck() {
		spellChecker3.checkSpelling();
	}
}
