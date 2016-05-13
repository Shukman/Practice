package Practice160513;

import java.util.Scanner;

public class Task01 {
	
	/*
	 * Создать метод, который будет считать сколько денег получает работник в неделю. Метод должен принимать на входе два аргумента (зарплата в час, кол-во проработанных часов).
	 * Условия:
	 * 1) Каждый час после 40 считается за полтора.
	 * 2) Работник не может работать больше, чем 60 часов в неделю.
	 * 3) Работник не может получать меньше 8 долларов в час.
	 */
	
	
	private static void salaryInWeek(double salary, double time) {
		
		double salaryInWeek;
		
		if(salary >= 8 && time <= 40){
			
		salaryInWeek = salary * time;
		System.out.println("Salary in week = " + salaryInWeek);
		
		}else if(time > 40 && time <= 60 && salary >= 8){
			
			double p = (time - 40);
			salaryInWeek = salary * (time - p) + (p * 1.5 * salary);
			System.out.println("Salary in week = " + salaryInWeek);
			
		}else{
			System.out.println("Entered incorrectly by salary or time! \nRepeat plz!");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Salary in hour: ");
		double a = in.nextDouble();
		
		System.out.print("Working time: ");
		double b = in.nextDouble();
		
		salaryInWeek(a, b);
		
	}
}
