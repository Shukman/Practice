package Practice160430;

import java.util.Scanner;

public class Task01 {
	
	public static void main(String[] args) {
		
		/*
		 * Натуральное число, большее 1, называется простым,
		 *  если оно ни на что не делится, кроме себя и 1. 
		 *  Другими словами, n>1 – простое, если при делении 
		 *  на любое число от 2 до n-1 есть остаток. Создайте код,
		 *  который выводит все простые числа из интервала
		 *  от 2 до 10. Результат должен быть: 2,3,5,7
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Введите число > 2 и < 10: ");
		int num = in.nextInt();
		
		if(num % 2 != 0){
			System.out.println("Введенное число простое: " + num);
		}else{
			System.out.println("Введенное число не простое: " + num);
		}
		
		
		
		
	}
	
}
