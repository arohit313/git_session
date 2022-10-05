package com.greatlearning.department.main;

import com.greatlearning.department.model.AdminDepartment;
import com.greatlearning.department.model.HrDepartment;
import com.greatlearning.department.model.TechDepartment;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdminDepartment objAdimn = new AdminDepartment();

		System.out.println("*******************************************************************************");
		System.out.println("\t\t\tDepartment Functionalities");
		System.out.println("*******************************************************************************");
		System.out.println("\n");

		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("\t\t\t Admin Department Functionalities");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Department Name : " + objAdimn.departmentName());
		System.out.println("Todays Work     : " + objAdimn.getTodaysWork());
		System.out.println("Work Deadline   : " + objAdimn.getWorkDeadline());
		System.out.println("Is Holiday      : " + objAdimn.isTodayAHoliday());
		System.out.println("\n");

		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("\t\t\t Hr Department Functionalities");
		System.out.println("--------------------------------------------------------------------------------");
		HrDepartment objHr = new HrDepartment();
		System.out.println("Department Name : " + objHr.departmentName());
		System.out.println("Todays Work     : " + objHr.getTodaysWork());
		System.out.println("Work Deadline   : " + objHr.getWorkDeadline());
		System.out.println("Do Activity     : " + objHr.doActivity());
		System.out.println("Is Holiday      : " + objAdimn.isTodayAHoliday());
		System.out.println("\n");

		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("\t\t\t Tech Department Functionalities");
		System.out.println("--------------------------------------------------------------------------------");
		TechDepartment objTech = new TechDepartment();
		System.out.println("Department Name : " + objTech.departmentName());
		System.out.println("Todays Work     : " + objTech.getTodaysWork());
		System.out.println("Work Deadline   : " + objTech.getWorkDeadline());
		System.out.println("Tech Stack Info : " + objTech.getTechStackInformation());
		System.out.println("Is Holiday      : " + objAdimn.isTodayAHoliday());
		System.out.println("\n********************************************************************************");

	}

}
