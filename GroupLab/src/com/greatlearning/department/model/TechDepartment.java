package com.greatlearning.department.model;

public class TechDepartment extends SuperDepartment {
	@Override
	public String departmentName() {
		return "Tech Department";
	}

	@Override
	public String getTodaysWork() {
		return "Complete coding of module";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTechStackInformation() {
		return "core Java";
	}
}
