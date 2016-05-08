package Practice160508;

import java.util.Scanner;

public class Task01 {
	
	public static void main(String[] args) {
		
		/*
		 * Программа запрашивает с клавиатуры два числа (целых). 
		 * Далее программа показывает на экране все числа в заданном диапазоне, 
		 * которые делятся на 7 и не делятся на 3.
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Введите положительное первой число: ");
		int num1 = in.nextInt();
		
		
		System.out.print("Введите положительное второе число больше первого: ");
		int num2 = in.nextInt();

		System.out.println();
		
		System.out.println("Числа из заданного диапазона: ");
		int count = 0;
		for(int i = num1; i <= num2; i++){
			System.out.print(i + " ");
			count++;
			if(count % 10 == 0){
				System.out.print("\n");
			}
		}
		System.out.println();
		System.out.print("\nРезультат: ");
		for(int i = num1; i <= num2; i++){
			if(i % 7 == 0 && i % 3 != 0){
				System.out.print(i + " ");
				count++;
				if(count % 10 == 0){
					System.out.print("\n");
				}
			}
		}
		
		
	}

}
