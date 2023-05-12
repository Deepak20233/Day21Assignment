package com.java;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest2 {
	public static void main(String [] args) {
		respondAsHappyMood();
	}
	public static void respondAsHappyMood() { // TC1.2
		MoodAnalyser moodAnalyzer = new MoodAnalyser();
		String result = moodAnalyzer.moodAnalysis("I am in happy Mood");
		System.out.println("Iam in " + result + " mood.");
		Assert.assertEquals("Happy", result);
}
}