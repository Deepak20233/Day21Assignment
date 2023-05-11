package com.java;

public class MoodAnalyser {
	public String moodAnalysis(String msg) {

		if (msg.contains("sad")) {
			return "Sad";
		} else {
			return "Happy";
		}
	}

	public static void main(String[] args) {
		System.out.println("********Welcom To Mood Analyzer Problems***********");
		
		MoodAnalyser moodAnalysis = new MoodAnalyser();
		String sadMood = moodAnalysis.moodAnalysis("Iam sad mood");
		System.out.println("My Mood is: " + sadMood);
		System.out.println("<----------------OR------------------->");
		String happyMood = moodAnalysis.moodAnalysis("Iam happy mood");
		System.out.println("My Mood is: " + happyMood);

	}
}
