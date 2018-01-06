package com.saj.employeeApp;

public class Employee implements Cloneable {
	// private int employeeID;
	final private String employeeID;
	final private String firstName;
	final private String lastName;
	
	// public int getEmployeeID() {
	// 	   return employeeID;
	// }
	// public void setEmployeeID(int employeeID) {
	//     this.employeeID = employeeID;
	// }
	
	/*
	 *  Addition of a constructor, and removal of
	 *  the setter methods allows employee to
	 *  become immutable. The addition of the
	 *  final field is for the purpose of clarity
	 *  to potential future programmers.
	 */
	public Employee(String id, String first, String last) {
		employeeID = id;
		firstName = first;
		lastName = last;
	}
	
	public int getEmployeeID() {
		return Integer.parseInt(employeeID);
	}
	// public void setEmployeeID(int id) {
	//     this.employeeID = Integer.toString(id);
	// }
    public String getFirstName() {
	    return firstName;
	}
	// public void setFirstName(String firstName) {
	//	   this.firstName = firstName;
	// }
	public String getLastName() {
		return lastName;
	}
	// public void setLastName(String lastName) {
	//	 this.lastName = lastName;
	// }
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	/*
	 *  An override of the equals method that compares
	 *  whether the employee ID of two instances of this
	 *  class are the same.
	 */
	public boolean equals(Object obj) {
		if((obj != null) && (obj instanceof Employee)) {
			Employee emp = (Employee)obj;
			if(this.employeeID == emp.employeeID) {
				return true;
			}
		}
		return false;
	}
	
	public String hasCode() {
		return employeeID;
	}
}
