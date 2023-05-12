package com.java;

public class MoodAnalyzerCustomExceptions {

	public String message;
	String returnMessage;

	public MoodAnalyzerCustomExceptions(String message) // Parameterized Constructor
	{
		this.message = message;
	}

	public String analyseMood() throws MoodAnalyzerExceptions {
		try {
			if (message.length() == 0) {
				throw new MoodAnalyzerExceptions(MoodAnalyzerExceptions.ExceptionType.EMPTY,
						"Please enter some thing!");
			}
			returnMessage = (message.contains("sad")) ? "SAD" : "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalyzerExceptions(MoodAnalyzerExceptions.ExceptionType.NULL, "Please enter some thing!");
		}
		return returnMessage;
	}

	public static void main(String[] args) {

		try {
			//MoodAnalyzerCustomException moodAnalyzer = new MoodAnalyzerCustomException(""); //ExceptionType is EMPTY
			MoodAnalyzerCustomExceptions moodAnalyzer = new MoodAnalyzerCustomExceptions(null); //ExceptionType is NULL
			String mood = moodAnalyzer.analyseMood(); // Here using Default Constructor
			System.out.println("My Mood is " + mood);
		} catch (MoodAnalyzerExceptions e) {
			System.out.println(e.type);
		}
	}
}
