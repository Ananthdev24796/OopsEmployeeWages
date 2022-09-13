/**
 Refactor the Code to write a Class Method to Compute Employee Wage - Use Class Method and Class
 * 
 */
package com.bridgelabz;

/**
 * @author Iam_A
 *
 */
public class EmployeeWage {

//		final int WagesPerHours = 20;
//		final int totalWorkingHrs = 8;
//		int partTimeWorkingHrs = 4;
//		int totalWrkDays =20;
//		final int maxWorkHrs = 100;

	
	public int  company1(int WagesPerHours,int totalWorkingHrs,int totalWrkDays, int maxWorkHrs) {
		
		computeEmployeeWage( WagesPerHours, totalWorkingHrs, totalWrkDays,  maxWorkHrs);
		return 0;
	}
	public int  company2(int WagesPerHours,int totalWorkingHrs,int totalWrkDays, int maxWorkHrs) {
		computeEmployeeWage( WagesPerHours, totalWorkingHrs, totalWrkDays,  maxWorkHrs);
		return 0;
		
	}
		
	public int  computeEmployeeWage(int WagesPerHours,int totalWorkingHrs,int totalWrkDays, int maxWorkHrs) {
		
		int dailyWages = 0;
		int totalWages=0;
		int empHrs =0;
		int totalEmpHrs =0;
		int wrkdays =0;
		
		while(wrkdays < totalWrkDays && empHrs < maxWorkHrs ) {
			wrkdays++;
			System.out.println("Total Working Hours+"+empHrs);
			// Random Check 
			int empRandomCheck = (int)(Math.random()*3);
			System.out.println("Random Check :"+empRandomCheck);
			
			//Using Switch to Fine Employee wage
			switch (empRandomCheck) {
			case 1:
				System.out.println("Full Time Employee");
				empHrs = 8;
				break;
			case 2:
				System.out.println("Part Time Employee");
				empHrs = 4;
				break;
			case 0:
				System.out.println("Employee Absent");
				break;
				
			}
			totalEmpHrs = totalEmpHrs+empHrs;
			System.out.println("Total Working days"+ "\s" + wrkdays +  "\s" + "Total Working Hrs"+ "\s"+ totalEmpHrs);
			
			
		}
		int totalEmployeeWage =totalEmpHrs*empHrs;
		System.out.println("Total EmployeeWage:"+ totalEmployeeWage );
		
		return totalEmployeeWage;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeWage objEmp = new EmployeeWage();
//		objEmp.computeEmployeeWage(20,8,10,10);
		objEmp.company1(18, 8, 10, 10);
		objEmp.company1(20, 8, 20, 100);
		
	

	}

}
