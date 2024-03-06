package com.dipak.employeewagecomputation;
import java.util.*;
public class EmployeeWageComputation {

	public static void main(String[] args) {
		
		int attendance; 
		Random random = new Random();
		attendance = random.nextInt(9)%2;
		
		System.out.println("WelCome Employee wage Computation...!");
		
		if(attendance==1) {
			System.out.println("Employee is Presente...!");
			
		}else {
			System.out.println("Employee is Absent!");
			
		}
		
	}

}