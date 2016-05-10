package Practice160510;

import java.util.Arrays;

public class Task04 {
	
	public static void main(String[] args) {
		
		/*
		 * Создать массив и записать его в обратном порядке.
		 * 
		 */
		
		int[] mas = {3, 1, 7, 14, 5};
		System.out.println(Arrays.toString(mas));
		
		int[] k = new int[mas.length];
		for (int i = mas.length - 1; i >= 0; i--) {
				k[i] = mas[mas.length - (i) - 1];
		}
		System.out.print(Arrays.toString(k));
	}
}
