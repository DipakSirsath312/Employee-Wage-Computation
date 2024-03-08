package com.dipak.employeewagecomputation;
import java.util.*;
public class EmployeeWageComputation {

	public static void main(String[] args) {
		
		System.out.println("WelCome Employee wage Computation...!");
		
		int attendance; 
		int Emp_Type;
		int daily_emp_wage = 0;
		int Monthly_Wage = 0;
		final int WAGE_PER_HOUR = 20;
		final int FULL_DAY_HOUR = 8; 
		final int Part_Time_Hour = 4;
		final int Work_Days = 20;
		
		for(int i = 1;i <=Work_Days;i++) {
			System.out.println("Day:"+i);
			Random random = new Random();
			attendance = random.nextInt(9)%2;
			
			switch(attendance) {
				case 0:
					System.out.println("Employee Is Absent");
					break;
				case 1:
					System.out.println("Employee Is Present");
					Emp_Type = random.nextInt(9)%2;
					switch(Emp_Type) {
					case 0:
						System.out.println("Employee Is Part Time");
						daily_emp_wage = WAGE_PER_HOUR * Part_Time_Hour;
						break;
					case 1:
						System.out.println("Employee Is Full Time");
						daily_emp_wage = WAGE_PER_HOUR * FULL_DAY_HOUR;
						break;
					}
					
					Monthly_Wage = Monthly_Wage + daily_emp_wage;
					System.out.println("Employee Daily Wages :"+daily_emp_wage);
					break;		
			}
					System.out.println("--------------------------");
		}
					System.out.println("Employee Monthly Wage:" +Monthly_Wage);
	}

}     
