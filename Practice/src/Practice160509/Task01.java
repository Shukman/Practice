package Practice160509;

import java.util.Scanner;

public class Task01 {
	
	public static void main(String[] args) {
		
		/*
		 * Вывод на экран таблицы факториалов от 1 до N. N вводится с клавиатуры перед циклом. 
		 *	Затем на экране выводится значение факториала этого числа (факториал числа - произведение всех чисел от 1 до этого числа, 
		 * 	1! =1, 2! = 1*2, 3! = 1*2*3 = 6, 4! = 1*2*3*4 = 24 и т.д).
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Введите целое число: ");
		int num = in.nextInt();
		
		int otvet = 1;
		for (int i = 1; i <= num; i++) {
			otvet = otvet * i;
		}		
		
		System.out.println("ответ равен: " + otvet);
	}

}
