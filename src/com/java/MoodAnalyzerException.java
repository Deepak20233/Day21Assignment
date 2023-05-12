package com.java;

public class MoodAnalyzerException extends Exception {

	public ExceptionType type;

	public enum ExceptionType {
		NULL, EMPTY, INVALID;
	}

	public MoodAnalyzerException(ExceptionType type, String msg) {
		super(msg);
		this.type = type;
	}
}
