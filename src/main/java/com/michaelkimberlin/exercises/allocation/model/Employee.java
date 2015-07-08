package com.michaelkimberlin.exercises.allocation.model;

import java.util.HashSet;
import java.util.Set;

/**
 * A representation of an employee and their subordinates
 */
public class Employee {

	private EmployeeType type;
	private Set<Employee> subordinates = new HashSet<Employee>();
	
	/**
	 * Constructs an employee of the given type
	 * 
	 * @param type  the type of employee
	 */
	public Employee(EmployeeType type) {
		this.type = type;
	}
	
	/**
	 * Adds a subordinate employee to the organizational hierarchy of the current employee
	 * 
	 * @param subordinate  the subordinate to be added to the set of subordinates
	 * @return this employee
	 */
	public Employee addSubordinate(Employee subordinate) {
		return null;
	}
	
}
