package com.michaelkimberlin.exercises.allocation.model;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

import org.junit.Test;

public class EmployeeTest {

	@Test(expected=UnsupportedOperationException.class)
	public void shouldReturnUnmodifiableSetOfEmployees() {
		Employee employee = new Employee(EmployeeType.MANAGER);
		employee.getSubordinates().add(new Employee(EmployeeType.DEVELOPER));
	}
	
	@Test(expected=IllegalStateException.class)
	public void shouldThrowIllegalStateExceptionWhenSubordinateAddedToDeveloper() {
		Employee employee = new Employee(EmployeeType.DEVELOPER);
		employee.addSubordinate(new Employee(EmployeeType.MANAGER));
	}

	@Test(expected=IllegalStateException.class)
	public void shouldThrowIllegalStateExceptionWhenSubordinateAddedToQA() {
		Employee employee = new Employee(EmployeeType.QA);
		employee.addSubordinate(new Employee(EmployeeType.MANAGER));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowIllegalArgumentExceptionWhenNullSubordinateAdded() {
		new Employee(EmployeeType.MANAGER).addSubordinate(null);
	}
	
	@Test
	public void shouldReturnThisEmployeeWhenAddingSubordinate() {
		Employee employee = new Employee(EmployeeType.MANAGER);
		
		assertThat(employee, equalTo(employee.addSubordinate(new Employee(EmployeeType.DEVELOPER))));
	}
	
	@Test
	public void shouldAddEmployeeToSubordinatesForManager() {
		Employee subordinate = new Employee(EmployeeType.DEVELOPER);
		Employee manager = new Employee(EmployeeType.MANAGER).addSubordinate(subordinate);
		
		assertThat(manager.getSubordinates(), hasItem(subordinate));
	}
	
	@Test
	public void shouldClearSubordinates() {
		fail();
	}
}
