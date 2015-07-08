package com.michaelkimberlin.exercises.allocation.model;

import static org.junit.Assert.fail;

import org.junit.Test;

public class EmployeeTest {

	@Test(expected=IllegalStateException.class)
	public void shouldThrowExceptionWhenSubordinateAddedToDeveloper() {
		fail();
	}

	@Test(expected=IllegalStateException.class)
	public void shouldThrowExceptionWhenSubordinateAddedToQA() {
		fail();
	}
	
	@Test
	public void shouldDoNothingWhenNullSubordinateAdded() {
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
