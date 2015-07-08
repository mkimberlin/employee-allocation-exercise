package com.michaelkimberlin.exercises.allocation;

import static org.junit.Assert.fail;

import org.junit.Test;

public class AllocationCalculatorTest {

	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowIllegalArgumentExceptionIfGivenEmployeeIsNull() {
		AllocationCalculator calculator = new AllocationCalculator();
		
		calculator.calculateExpenseAllocation(null);
	}
	
	@Test
	public void shouldReturnEmployeeAllocationForEmployeesWithNoSubordinates() {
		fail();
	}
	
	@Test
	public void shouldReturnSumOfEmployeeAllocationsForSubordinates() {
		fail();
	}
	
	@Test
	public void shouldRecursivelyAddAllSubordinateAllocations() {
		fail();
	}
}
