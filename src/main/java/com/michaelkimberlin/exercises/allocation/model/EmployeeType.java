package com.michaelkimberlin.exercises.allocation.model;

/**
 * Simple enumeration of valid employee types and their associated expense allocations
 */
public enum EmployeeType {

	MANAGER(300),
	QA(500),
	DEVELOPER(1000);

	private int allocation;

	/**
	 * Returns the expense allocation allowed for an employee of this type
	 * 
	 * @return the allocation for this employee type in dollars
	 */
	public int getAllocation() {
		return allocation;
	}

	private EmployeeType(int allocation) {
		this.allocation = allocation;
	}
}
