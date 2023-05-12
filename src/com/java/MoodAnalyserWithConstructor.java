package com.java;

public class MoodAnalyserWithConstructor {

	public String message;
	String returnMessage;

	public MoodAnalyserWithConstructor() {
	} // Default Constructor

	public MoodAnalyserWithConstructor(String message) // Parameterized Constructor
	{
		this.message = message;
	}

	public String analyseMood(String message) {
		this.message = message;
		return analyseMood();
	}

	public String analyseMood() {
		return returnMessage = (message.contains("sad")) ? "SAD" : "HAPPY";
	}
	
	public static void main(String[] args) {
		MoodAnalyserWithConstructor moodAnalyzer = new MoodAnalyserWithConstructor();
		String sadMood = moodAnalyzer.analyseMood("Iam in sad mood"); // Here using Parameterized Constructor
		System.out.println("My Mood is " + sadMood);
		System.out.println("<----------------OR------------------->");
		String happyMood = moodAnalyzer.analyseMood("Iam in happy mood");
		System.out.println("My Mood is " + happyMood);
	}

}