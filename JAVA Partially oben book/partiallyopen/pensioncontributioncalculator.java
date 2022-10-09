package partiallyopen;

import java.util.Scanner;

public class pensioncontributioncalculator {
	public static void main(String[] args) {
		final int max_salary = 6000;
		final double empl_age_55_and_below = 0.2;
		final double empr_age_55_and_below = 0.17;
		final double empl_age_55_to_60 = 0.13;
		final double empr_age_55_to_60 = 0.13;
		final double empl_age_60_to_65 = 0.075;
		final double empr_age_60_to_65 = 0.09;
		final double empl_age_65_above = 0.05;
		final double empr_age_65_above = 0.075;
		int salary, age; 
		double contrisalary1, contrisalary2;
		double emplcont, emprcont, totcont;
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter the salary :$ ");
		salary= in.nextInt();
		System.out.printf("Enter the age    : ");
		age= in.nextInt();
		while(salary <= max_salary)
		{
			if (age <= 55) 
			{ 
				contrisalary1=empl_age_55_and_below*100;
				emplcont= contrisalary1/100*salary;
				contrisalary2=empr_age_55_and_below*100;
			    emprcont= contrisalary2/100*salary;
			}
		else if (age <= 60) 
			{
			contrisalary1=empl_age_55_to_60*100;
			emplcont= contrisalary1/100*salary;
			contrisalary2=empr_age_55_to_60*100;
		    emprcont= contrisalary2/100*salary;
			} 
			else if (age <= 65) 
			{ 
				contrisalary1=empl_age_60_to_65*100;
				emplcont= contrisalary1/100*salary;
				contrisalary2=empr_age_60_to_65*100;
			    emprcont= contrisalary2/100*salary;
			}
			else  
			{ 
				contrisalary1=empl_age_65_above*100;
				emplcont= contrisalary1/100*salary;
				contrisalary2=empr_age_65_above*100;
			    emprcont= contrisalary2/100*salary;
			}
			
			totcont=emplcont+emprcont;
			System.out.printf("The employee's contribution is :$ %.2f%n",emplcont);
			System.out.printf("The employer's contribution is :$ %.2f%n",emprcont);
			System.out.printf("The total contribution is :$ %.2f%n",totcont);
			break;
		}
		
		
	}
}
