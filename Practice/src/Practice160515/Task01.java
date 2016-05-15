package Practice160515;

import java.util.Scanner;

public class Task01 {
	
	/*
	 * Напишите на java игру, в которой пользователя просят угадать число от 1 до 30. 
	 * Если пользователь называет число меньше загаданного, то выводится сообщение "Число слишком маленькое". 
	 * Если пользователь называет число больше загаданного, то выводится сообщение "Число слишком большое". 
	 * А если пользователь угадал загаданное число, то выводится поздравление об успехе, 
	 * показывается загаданное число и общее число попыток угадывания. 
	 * Так же можно этот диапозон увеличить, или например, добавить ещё подсказок.
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int Max = 50;
		int Min = 1;
		
		System.out.print("Угадайте число от " + Min + " до " + Max +" (включительно): ");
		int num = in.nextInt();
		
		
		int findNumber = Min + (int)(Math.random() * ((Max - Min) + 1));
		int count = 0;
		
		while(num != findNumber){
			if(num > findNumber) {
				System.out.println("Число больше задуманного, повторите попытку");
				System.out.print("Угадайте число от " + Min + " до " + Max +" (включительно): ");
				int num1 = in.nextInt();
				num = num1;
				count++;
			}
			if (num < findNumber){
				System.out.println("Число меньше задуманного, повторите попытку");
				System.out.print("Угадайте число от " + Min + " до " + Max +" (включительно): ");
				int num2 = in.nextInt();
				num = num2;
				count++;
			}
		}
		if (num == findNumber){
			count++;
			System.out.println("Поздравляем вы угадали задуманное число!");
			System.out.println("Число попыток равно: " + count);
		}
	}
}
