package com.dipak.employeewagecomputation;
import java.util.*;
public class EmployeeWageComputation {

	public static void main(String[] args) {
		int attendance; 
		final int WAGE_PER_HOUR=20;
		final int FULL_DAY_HOUR=8;
		int daily_emp_wage=0; 
		
		Random random = new Random();
		attendance = random.nextInt(9)%2;
		
		System.out.println("WelCome Employee wage Computation...!");
		
		if(attendance==1) {
			System.out.println("Employee is Present...!");
			daily_emp_wage = WAGE_PER_HOUR * FULL_DAY_HOUR;
			System.out.println("Employee Daily Wages :-"+daily_emp_wage);
			
		}else {
			System.out.println("Employee is Absent...!");
			
		}
		
	}

}
