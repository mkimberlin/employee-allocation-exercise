package com.michaelkimberlin.exercises.allocation;

import com.michaelkimberlin.exercises.allocation.model.Employee;

/**
 * Calculates the expense allocation for an employee hierarchy.
 */
public class AllocationCalculator {

	/**
	 * Calculates the expense allocation of an entire employee hierarchy.
	 * 
	 * @param employee  the employee whose allocation is to be calculated
	 * @return  the total expense allocation for the employee's subordinate heirarchy
	 */
	public int calculateExpenseAllocation(Employee employee) {
		if(employee == null) {
			throw new IllegalArgumentException("Cannot calculate allocation for null employee.");
		}
		
		int allocation = employee.getType().getAllocation();
		for(Employee subordinate: employee.getSubordinates()) {
			allocation += calculateExpenseAllocation(subordinate);
		}
		
		return allocation;
	}

}
