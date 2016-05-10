package Practice160510;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
	
	public static void main(String[] args) {
		
		/*
		 *  Создать массив из 5 целых чисел. Заполнить массив с клавиатуры. 
		 *  Вывести массив на экран с указанием индекса каждого элемента, 
		 *  каждый элемент массива в отдельной строке. 
		 *	Затем с клавиатуры вводится целое число. 
		 *	Нужно найти, сколько раз в массиве встречается это число. 
		 *	Результат вывести в отдельной строке.
		 * 
		 * 
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Введите первое целое число: ");
		int num1 = in.nextInt();
		
		System.out.print("Введите второе целое число: ");
		int num2 = in.nextInt();
		
		System.out.print("Введите третье целое число: ");
		int num3 = in.nextInt();
		
		System.out.print("Введите четвертое целое число: ");
		int num4 = in.nextInt();
		
		System.out.print("Введите пятое целое число: ");
		int num5 = in.nextInt();
		
		int[] mas = {num1, num2, num3, num4, num5};
		System.out.println(Arrays.toString(mas));
		
		for (int i = 0; i < mas.length; i++) {
			System.out.println("значение массива = " + mas[i]);
		}
		
		System.out.print("Введите целое число: ");
		int num = in.nextInt();
		
		int count= 0;
		for (int i = 0; i < mas.length; i++) {
			if(num == mas[i]){
				count++;
			}
		}
		System.out.println("Заданное число встречается: " + count);
		
		
		
		
	}

}
