package com.saj.studentReportApp;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Student {
	private List<TestScore> testScores;
	private String name;
	
	public Student(List<TestScore> scores, String name) {
		// this.testScores = scores;
		// Allows Student to be fully immutable.
		this.testScores = Collections.unmodifiableList(
				new  ArrayList<TestScore>(scores));
		this.name = name;
	}

	public List<TestScore> getTestScores() {
		return testScores;
	}

	public String getName() {
		return name;
	}
	
	public int getAverage() {
		int total = 0;
		for (TestScore testScore : testScores) {
			total += testScore.getPercentCorrect();
		}
		return total / testScores.size();
	}
}
