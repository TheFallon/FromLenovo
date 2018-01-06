package com.saj.studentReportApp;

public class StudentReport {
	public void printStudentGrades(Student[] students) {
		// List<TestScore> testScores;
		// int total;
		
		for(Student student: students) {
			// testScores = student.getTestScores();
			// total = 0;
			// for(TestScore testScore : testScores) {
				// total += testScore.getPercentCorrect();
			// }
			System.out.println("Final grades for " + student.getName() + " is " 
					+ student.getAverage()); /* total/ testScores.size()); */
		}
	}
}
