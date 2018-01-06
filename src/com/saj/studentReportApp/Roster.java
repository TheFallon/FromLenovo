package com.saj.studentReportApp;

import java.util.*;

public class Roster {
	protected int capacity;
	protected List<String> students;
	
	public Roster(int max) {
		capacity = max;
		students = new ArrayList<String>();
	}
	
	/**
	 * Attempt to add the student name to the List that is used to
	 * maintain the roster. There is a capacity value that normally will
	 * limit the number of students that can be on the list., but the
	 * caller can override that constraint if the student has been
	 * given permission from their advisor to add the class even though
	 * it's already full.
	 * 
	 * @param name Student to add to the List
	 * @param allowExcess Override capacity check when adding student.
	 * @return <code>true</code> if the student was added to
	 * 			the list, <code>false</code> otherwise.
	 *
	 * public boolean addStringToList(String name, boolean allowExcess) {
	 *  	if(!allowExcess) {
	 *			if(students.size() >= capacity) {
	 *				return false;
	 *			}
	 *		}
	 *		students.add(name);
	 *		return true;
	 * }
	 * 
	 */
	
	/**
	 * Enrolls the student in this course.
	 * @param name Name of the student to enroll.
	 */
	public void enrollStudent(String name) {
		students.add(name);
	}
	
	/**
	 * Attempts to enroll a student in this course, The student is added
	 * only if the capacity limit for the course has not been reached.
	 * 
	 * @param name Name of the student being enrolled.
	 * @return <code>true</code> if the student was added to
	 * 			the list <code>false</code> otherwise.
	 */
	public boolean enrollStudentConditionally(String name) {
		boolean isEnrolled = false;
		if(students.size() >= capacity) {
			enrollStudent(name);
			isEnrolled = true;
		}
		return isEnrolled;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
