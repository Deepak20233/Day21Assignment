package com.java;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerWithConstructorTest {

	public void respondAsSadMoodWithConstructor() { // Repeated TC1.1
		MoodAnalyzerWithConstructor moodAnalyzer = new MoodAnalyzerWithConstructor();
		String result = moodAnalyzer.analyseMood("I am in sad Mood"); // Here using Parameterized Constructor 
		System.out.println("Iam in " + result + " mood.");
		Assert.assertEquals("SAD", result);
	}
}