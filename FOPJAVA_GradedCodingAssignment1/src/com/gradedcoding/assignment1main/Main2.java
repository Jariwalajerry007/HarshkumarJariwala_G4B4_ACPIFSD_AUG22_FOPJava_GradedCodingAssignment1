package com.gradedcoding.assignment1main;

import com.gradedcoding.assignment1admin.AdminDepartment;
import com.gradedcoding.assignment1hr.HrDepartment;
import com.gradedcoding.assignment1tech.TechDepartment;

/*import com.gradedcoding.assignment1supercdept.AdminDepartment;
import com.gradedcoding.assignment1supercdept.HrDepartment;
import com.gradedcoding.assignment1supercdept.TechDepartment;
*/
public class Main2 {
	public static void main(String[] args) {

		AdminDepartment objAdmin = new AdminDepartment();                            // Creating an object of superclass. 
		System.out.println(objAdmin.departmentName());
		System.out.println(objAdmin.getTodaysWork());
		System.out.println(objAdmin.getWorkDeadline());
		System.out.println(objAdmin.isTodayAHoliday() + '\n');                       // Accessing an object of superclass.


		HrDepartment objHr = new HrDepartment();                                     // Creating an object of superclass. 
		System.out.println(objHr.departmentName()); 
		System.out.println(objHr.getTodaysWork());
		System.out.println(objHr.getWorkDeadline());
		System.out.println(objHr.doActivity());
		System.out.println(objHr.isTodayAHoliday() + '\n');                          // Accessing an object of superclass.
		System.out.println("");
		
		TechDepartment objTech = new TechDepartment();                               // Creating an object of superclass. 
		System.out.println(objTech.departmentName());
		System.out.println(objTech.getTodaysWork());
		System.out.println(objTech.getWorkDeadline());
		System.out.println(objTech.getTechStackInformation());
		System.out.println(objTech.isTodayAHoliday());                               // Accessing an object of superclass.
}
}