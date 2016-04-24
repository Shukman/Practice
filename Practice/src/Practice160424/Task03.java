package Practice160424;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/*
		 * Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155] целое число в интервал (25;100) и сообщать результат на экран.
		 */
		
		Scanner in = new Scanner(System.in);
//		
//		System.out.print("Введите число от 5 до 155: ");
//		int x = in.nextInt();
		
		//Version(asshand):
//		for(int i = 26; i < 100; i++){
//			if(x == i){
//				System.out.println("Ваше число лежит в этом интервале (25:100)");
//			}
//		}

		//Not bad:
//		if (x > 25 && x < 100){
//			System.out.println("О да!");
//		}else {
//			System.out.println("Вы пьяны 0_о, попробуйте еще раз!");
//		}
		
		//what is that? o0:
		int y = 0;
		int x = 0;
		do {	
			System.out.print("Введите число от 5 до 155: ");
			x = in.nextInt();
			if (x > 25 && x < 100){
				System.out.println("Вы попали в заданный интервал (25:100)");
				y = x;	
			}else {
				System.out.print("Вы не попали в заданный интервал, попробуйте еще раз");
			}
		}while(y != x); 
		
		
	}

}
