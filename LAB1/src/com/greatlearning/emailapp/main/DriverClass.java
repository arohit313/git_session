package com.greatlearning.emailapp.main;

import java.util.Scanner;

import com.greatlearning.emailapp.model.Employee;
import com.greatlearning.emailapp.service.CredentialService;
import com.greatlearning.emailapp.service.CredentialServiceImpl;

public class DriverClass {
	public static final String [] depts= {"Technical", "Admin" , "Human Resource", "Legal"};
	public static final String [] deptcodes= {"tech", "adm" , "hr", "lg"};
	public static void main(String[] args) {
		CredentialService service= new CredentialServiceImpl("gl.in");
		Scanner input = new Scanner(System.in);
		System.out.println("Input your First Name");
		String fname=input.next();
		System.out.println("Input your Last Name");
		String lname=input.next();
		Employee e = new Employee(fname,lname);
		System.out.println("Please enter department from following");
		for(int i=1 ; i<=depts.length;i++)
		{
			System.out.println(i+". "+depts[i-1]);
		}
		int deptNumber = input.nextInt();
		String emailId=service.generateEmailId(fname, lname, deptcodes[deptNumber-1]);
		e.setEmailId(emailId);
		String passWord=service.generatePassword();
		e.setPassWord(passWord);
		service.showcredentials(e);
		
		
	}

}
