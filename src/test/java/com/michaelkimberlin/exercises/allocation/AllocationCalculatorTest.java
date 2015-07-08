package com.michaelkimberlin.exercises.allocation;

import static org.junit.Assert.fail;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.michaelkimberlin.exercises.allocation.model.Employee;
import com.michaelkimberlin.exercises.allocation.model.EmployeeType;

public class AllocationCalculatorTest {

	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowIllegalArgumentExceptionIfGivenEmployeeIsNull() {
		AllocationCalculator calculator = new AllocationCalculator();
		
		calculator.calculateExpenseAllocation(null);
	}
	
	@Test
	public void shouldReturnEmployeeAllocationForEmployeesWithNoSubordinates() {
		AllocationCalculator calculator = new AllocationCalculator();
		Employee employee = new Employee(EmployeeType.DEVELOPER);
		
		int allocation = calculator.calculateExpenseAllocation(employee);
		
		assertThat(new Integer(allocation), equalTo(EmployeeType.DEVELOPER.getAllocation()));
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
