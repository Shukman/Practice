package Practice160515;

import java.util.Scanner;

public class Task02 {
	
	/*
	 * Напишите на java игру, в которой пользователь загадывает число, а компьютер должен его разгадать. 
	 * Если пользователь называет число меньше загаданного, то выводится сообщение "Число слишком маленькое". 
	 * Если пользователь называет число больше загаданного, то выводится сообщение "Число слишком большое". 
	 * А если пользователь угадал загаданное число, то выводится поздравление об успехе, 
	 * показывается загаданное число и общее число попыток угадывания. 
	 * Так же можно этот диапозон увеличить, или например, добавить ещё подсказок.
	 *
	 */
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Напишите минимальное значение в диапазоне: ");
		int	min = in.nextInt();
		
		System.out.print("Напишите максимальное значение в диапазоне: ");
		int max = in.nextInt();
		
		System.out.print("Загадайте число от " + min + " до " + max + " (включительно): ");
		String num = in.next();
		System.out.println();
		
		int count = 0;
		String temp = "";
		
		while(!temp.equals("верно")){
			int x = min + (max - min) / 2;
			
			System.out.print("Это ваше число? " + x + " (больше, меньше, верно) ");
			temp = in.next();

			if (temp.equals("меньше")){
				max = x - 1;
				count++;
			}
			if (temp.equals("больше")){
				min = x + 1;
				count++;
			}
			if(temp.equals("верно")) {
				count++;
				System.out.println("Ура! Ваше число: " + x);
				System.out.println("Число попыток равно: " + count);
			}
		}
	}
}