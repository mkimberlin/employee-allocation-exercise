package com.michaelkimberlin.exercises.allocation.model;

import com.google.common.collect.ImmutableSet;
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
	 * @throws IllegalArgumentException  if the provided subordinate is null
	 * @throws IllegalStateException  if this employee is not a manager
	 */
	public Employee addSubordinate(Employee subordinate) {
		if(subordinate == null) {
			throw new IllegalArgumentException("Subordinate employees cannot be null.");
		}
		
		if(EmployeeType.MANAGER != type) {
			throw new IllegalStateException("Subordinates can only be added to managers.");
		}
		
		subordinates.add(subordinate);
		
		return this;
	}

	public Employee clearSubordinates() {
		return null;
	}
	
	public Set<Employee> getSubordinates() {
		return ImmutableSet.copyOf(subordinates);
	}
	
}
