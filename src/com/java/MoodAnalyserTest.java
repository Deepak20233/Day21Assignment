package com.java;
import java.util.*;

import org.junit.Assert;

public class MoodAnalyserTest {

	public void respondAsSadMood() { // TC1.1
		MoodAnalyser moodAnalyzer = new MoodAnalyser();
		String result = moodAnalyzer.moodAnalysis("I am in sad Mood");
		System.out.println("Iam in " + result + " mood.");
		Assert.assertEquals("Sad", result);
	}
}
