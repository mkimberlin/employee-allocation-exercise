package com.michaelkimberlin.exercises.allocation;

import com.michaelkimberlin.exercises.allocation.model.Employee;

/**
 * Calculates the expense allocation for an employee hierarchy.
 */
public class AllocationCalculator {

	public int calculateExpenseAllocation(Employee employee) {
		if(employee == null) {
			throw new IllegalArgumentException("Cannot calculate allocation for null employee.");
		}
		return employee.getType().getAllocation();
	}

}
