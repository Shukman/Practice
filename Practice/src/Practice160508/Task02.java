package Practice160508;

import java.util.Scanner;

public class Task02 {
	
	
	final static double G = 9.8;
	public static void main(String[] args) {
		
		/*
		 * Написать программу для описания движения тела в свободном падении. 
		 * Формула S = g*t*t, где g=9.8 -ускорение при свободном падении, S- расстояние, пройденное телом за t секунд.
			С клавиатуры вводиться число секунд, в течении которого нужно отслеживать
			движение тела (например, 10) и программа выводит на экран номер секунды и
			расстояние, которое пройдет тело за n секунд.
			Как должен выглядеть результат работы программы:
			0	0
			1	9,8
			2	39,2
			3	88,2
			4	156,8
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Введите время(в секундах): ");
		double sekond = in.nextDouble();
		
		double S = G * Math.pow(sekond, 2);
		System.out.println("S = " + S);
		
		System.out.println("заданное время = " + sekond + ", пройденное расстояние за это время = " + S);
		
	}

}
