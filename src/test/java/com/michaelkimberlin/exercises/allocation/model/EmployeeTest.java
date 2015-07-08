package com.michaelkimberlin.exercises.allocation.model;

import static org.junit.Assert.fail;

import org.junit.Test;

public class EmployeeTest {

	@Test(expected=UnsupportedOperationException.class)
	public void shouldReturnUnmodifiableSetOfEmployees() {
		fail();
	}
	
	@Test(expected=IllegalStateException.class)
	public void shouldThrowIllegalStateExceptionWhenSubordinateAddedToDeveloper() {
		fail();
	}

	@Test(expected=IllegalStateException.class)
	public void shouldThrowIllegalStateExceptionWhenSubordinateAddedToQA() {
		fail();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowIllegalArgumentExceptionWhenNullSubordinateAdded() {
		fail();
	}
	
	@Test
	public void shouldAddEmployeeToSubordinatesForManager() {
		fail();
	}
	
	@Test
	public void shouldClearSubordinates() {
		fail();
	}
}
