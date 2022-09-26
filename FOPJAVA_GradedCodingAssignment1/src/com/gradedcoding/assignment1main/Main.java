package com.gradedcoding.assignment1main;

import com.gradedcoding.assignment1supercdept.SuperDepartment;

import java.util.Scanner;

import com.gradedcoding.assignment1supercdept.AdminDepartment;
import com.gradedcoding.assignment1supercdept.HrDepartment;
import com.gradedcoding.assignment1supercdept.TechDepartment;

public class Main {
	@SuppressWarnings("resource")                          //to suppress scanner close warnings...
	public static void main(String[] args) {
		String Reply="YES";                                // TO RUN WHOLE LOOP AGAIN
        while(Reply.equals("YES"))
        {
		System.out.println("Welcome to TASK REMINDER tab");
		System.out.println("I am taskie and I hope you are doing well");
		System.out.println("Please Select the Department");
		System.out.println("Note:Enter any number from 1 to 4");
		System.out.println(" 1.Super Department \n 2.Administraton \n 3.Humanresource \n 4.Technical");
		Scanner sc = new Scanner(System.in);
		int dept;
		dept = sc.nextInt();

		switch (dept) {
		
		case 1:{
		SuperDepartment objSuper=new SuperDepartment();                                  // Accessing an object of superclass. 
		System.out.println(objSuper.departmentName());
		System.out.println(objSuper.getTodaysWork());
		System.out.println(objSuper.getWorkDeadline()); 
		System.out.println(objSuper.isTodayAHoliday() + '\n');                           // Accessing an object of superclass.
		break;
		}
        case 2:{	
			AdminDepartment objAdmin = new AdminDepartment();                            // Creating an object of superclass. 
			System.out.println(objAdmin.departmentName());
			System.out.println(objAdmin.getTodaysWork());
			System.out.println(objAdmin.getWorkDeadline());
			System.out.println(objAdmin.isTodayAHoliday() + '\n');                       // Accessing an object of superclass.
			break;
		}
		case 3:{
			HrDepartment objHr = new HrDepartment();                                     // Creating an object of superclass. 
			System.out.println(objHr.departmentName()); 
			System.out.println(objHr.getTodaysWork());
			System.out.println(objHr.getWorkDeadline());
			System.out.println(objHr.doActivity());
			System.out.println(objHr.isTodayAHoliday() + '\n');                          // Accessing an object of superclass.
			System.out.println("");
			break;
		}	
          case 4: {			
			TechDepartment objTech = new TechDepartment();                               // Creating an object of superclass. 
			System.out.println(objTech.departmentName());
			System.out.println(objTech.getTodaysWork());
			System.out.println(objTech.getWorkDeadline());
			System.out.println(objTech.getTechStackInformation());
			System.out.println(objTech.isTodayAHoliday());                               // Accessing an object of superclass.

			break;

}
          default:
  			System.out.println("Sorry !!! There is no Department like that");
  			
  			
}                                                                                        // End of Switch case
		System.out.println("TYPE (YES) TO CONTINUE WITH NEW NUMBER & (NO) TO END");      // Typing YES will run whole code again
		Reply = sc.next();
}
        System.out.println("THE END");    // Final End after the input other then "YES" 
        
}
}