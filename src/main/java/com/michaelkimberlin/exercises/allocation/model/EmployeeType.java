package com.michaelkimberlin.exercises.allocation.model;

public enum EmployeeType {

	MANAGER(300),
	QA(500),
	DEVELOPER(1000);

	private int allocation;

	public int getAllocation() {
		return allocation;
	}

	private EmployeeType(int allocation) {
		this.allocation = allocation;
	}
}
