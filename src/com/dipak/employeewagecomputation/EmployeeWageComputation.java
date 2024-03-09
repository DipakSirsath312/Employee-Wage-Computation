package com.dipak.employeewagecomputation;
import java.util.*;
public class EmployeeWageComputation {
	
	int attendance; 
	int Emp_Type;
	int daily_emp_wage = 0;
	int Monthly_Wage = 0;
	int Total_work_hour = 0;
	int Total_work_days = 1;
	final int WAGE_PER_HOUR = 20;
	final int FULL_DAY_HOUR = 8; 
	final int Part_Time_Hour = 4;
	final int Work_Days = 20;
	
	public void Employeewagecomp()
	{
		System.out.println("WelCome Employee wage Computation...!");
		while(Total_work_hour <=100 && Total_work_days <=20)
		{
			System.out.println("Day:"+Total_work_days);
			Random random = new Random();
			attendance = random.nextInt(9)%2;
			
			switch(attendance) 
			{
				case 0:
					System.out.println("Employee Is Absent");
					break;
				case 1:
					System.out.println("Employee Is Present");
					Emp_Type = random.nextInt(9)%2;
					switch(Emp_Type) 
					{
					case 0:
						System.out.println("Employee Is Part Time");
						daily_emp_wage = WAGE_PER_HOUR * Part_Time_Hour;
						Total_work_hour = Total_work_hour + Part_Time_Hour;
						break;
					case 1:
						System.out.println("Employee Is Full Time");
						daily_emp_wage = WAGE_PER_HOUR * FULL_DAY_HOUR;
						Total_work_hour = Total_work_hour + FULL_DAY_HOUR;
						break;
					}
					
					Monthly_Wage = Monthly_Wage + daily_emp_wage;
					System.out.println("Employee Daily Wages :"+daily_emp_wage);
					break;		
			}
			System.out.println("Total Working Hour:"+Total_work_hour);
			System.out.println("--------------------------");
			Total_work_days++;
					
		}
			System.out.println("Employee Monthly Wage:"+Monthly_Wage);
}
	
public static void main(String[] args) {
	
	EmployeeWageComputation employeewage = new EmployeeWageComputation();
	employeewage.Employeewagecomp();
	}     
}