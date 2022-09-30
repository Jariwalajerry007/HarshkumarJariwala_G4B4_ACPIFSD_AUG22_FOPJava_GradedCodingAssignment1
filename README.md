



# HarshkumarJariwala_B4G4_ACPIFSD_AUG22_FOPJava_GradedCodingAssignment1
This is basic version of Graded Coding Assignment 1 given by GreatLearning


WORK REMINDERS ACCORDING TO DEPARTMENT

--> Public Superdepartment ---SuperClass

public String departmentName

public String getTodaysWork

public String getWorkDeadline

public String isTodayAholiday


--> Public admin extends Superdepartment

public String departmentName

public String getTodaysWork

public String getWorkDeadline


--> Public Hr extends Superdepartment

public String departmentName

public String getTodaysWork

public String getWorkDeadline

public String doActivity


--> Public tech extends Superdepartment

public String departmentName

public String getTodaysWork

public String getWorkDeadline

public String getTechStackInformation


--> Public class Main{

  HrDepartment

       sysout(obj.departmentName)="HR Departmnet"

       sysout(obj.getTodaysWork)="Fill today's timesheet and mark you attendance"

       sysout(obj.getWorkDeadline)="Complete by END OF DATE"

       sysout(obj.doActivity)="Team Lunch"

       Superdeparment(obj.HrDepartment isTodayAholiday)


  TechDepartment

       sysout(obj.departmentName)=Tech Department

       sysout(obj.getTodaysWork)=COmplete coding of module 1

       sysout(obj.getWorkDeadline)=Complete by EOD

       sysout(obj.getTechStackInformation)=core Java

       Superdeparment(obj.TechDepartment isTodayAholiday)


  AdminDepartment

       sysout(obj.departmentName)="Admin Department"

       sysout(obj.getTodaysWork)="Complete your documents Submission"

       sysout(obj.getWorkDeadline)="Complete by EOD"

       Superdeparment(obj.Admindepartment isTodayAholiday)



