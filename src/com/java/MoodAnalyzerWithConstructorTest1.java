package com.java;

import org.junit.Assert;

public class MoodAnalyzerWithConstructorTest1 {
	public static void main(String [] args) {
		respondAsHappyMoodWithConstructor();
	}
	public static void respondAsHappyMoodWithConstructor() { // Repeated TC1.2
		MoodAnalyzerWithConstructor moodAnalyzer = new MoodAnalyzerWithConstructor();
		String result = moodAnalyzer.analyseMood("I am in happy Mood"); // Here using Parameterized Constructor 
		System.out.println("Iam in " + result + " mood.");
		Assert.assertEquals("HAPPY", result);
	}
}
