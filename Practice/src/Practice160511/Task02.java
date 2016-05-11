package Practice160511;

import java.util.Arrays;

public class Task02 {
	
	public static void main(String[] args) {
		
		/*
		 * Удалить из массива все 0 и заполнить освободившиеся справа элементы значениями -1;
		 * ПРИМЕР 
		 * массив до изменений
		 * 1	0	12	-3	0	4	8
		 * массив после изменений
		 * 1	12	-3	4	8	-1	-1
		 */
		
		int[] mas = {1, 0, 12, -3, 0, 4, 8};
		int[] k = new int[mas.length];
		
//		//вариант 1
//		for (int i = 0; i < mas.length; i++) {
//			if(mas[i] == 0){
//				k[1] = mas[mas.length - 1];
//				mas[mas.length - 1] = mas[i];
//				mas[i] = k[1];
//				
//				k[1] = mas[mas.length - 2];
//				mas[mas.length - 2] = mas[i];
//				mas[i] = k[1];
//			}
//		}
//		mas[mas.length-2] = -1;
//		mas[mas.length-1] = -1;
//		System.out.println(Arrays.toString(mas));
	
		//вариант 2
		for (int i = 0; i < mas.length; i++) {
			if(mas[i] == 0){
				for (int j = i; j < k.length - 1; j++) {
					int temp = mas[j];
					mas[j] = mas[j+1];
					mas[j+1] = temp;
				}
			}
			if(mas[i] == 0){
				mas[i] = -1;
			}
		}
		System.out.println(Arrays.toString(mas));
		
	}
}
