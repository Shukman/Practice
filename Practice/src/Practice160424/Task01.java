package Practice160424;

import java.util.Scanner;

public class Task01 {
	
	public static void main(String[] args) {
		
		/*
		 * Пользователь вводит свой вес с клавиатуры, а в ответ получает сколько он весит на Луне (вес на Луне = вес на Земле + 0,17)
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("ведите свой вес: ");
		int x = in.nextInt();
		
		double moonWeight = 0.17;
		
		System.out.printf("выш вес на луне состовляет:" + "%.2f",(x * moonWeight));
		
	}

}

