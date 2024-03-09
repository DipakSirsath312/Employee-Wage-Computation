package com.dipak.employeewagecomputation;
import java.util.*;
public class EmployeeWageComputation {
	
	int attendance; 
	int Emp_Type;
	int daily_emp_wage = 0;
	int Monthly_Wage = 0;
	int Total_work_hour = 0;
	int Total_work_days = 1;
	int wage_per_hour ;
	int full_day_hour= 8; 
	int Part_Time_Hour = 4;
	int Work_Days  ;
	int monthly_working_hour ;

	public void Employeewagecomp(int wage_per_hour , int monthly_working_hour ,int Work_Days)
	{
		this.wage_per_hour = wage_per_hour ;
	    this.Work_Days = Work_Days;
		this.monthly_working_hour = monthly_working_hour ;
		System.out.println("WelCome Employee wage Computation...!");
		while(Total_work_hour <=  monthly_working_hour && Total_work_days <= Work_Days )
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
						daily_emp_wage = this.wage_per_hour * this.Part_Time_Hour;
						Total_work_hour = Total_work_hour + Part_Time_Hour;
						break;
					case 1:
						System.out.println("Employee Is Full Time");
						daily_emp_wage = this.wage_per_hour * this.full_day_hour;
						Total_work_hour = Total_work_hour + this.full_day_hour;
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
	employeewage.Employeewagecomp(20 ,100 , 20);
	
	EmployeeWageComputation employeewage1 = new EmployeeWageComputation();
	employeewage1.Employeewagecomp(10 ,50 , 15);
	}     
}