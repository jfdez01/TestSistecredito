package com.co.cinte.utils.messages;

public enum SimpleWords {
	NO("NO"), NAME_CELL("VerificacionRPF"),

	NP("NP");

	private String word;

	private SimpleWords(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}
}
