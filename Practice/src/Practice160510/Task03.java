package Practice160510;

import java.util.Arrays;

public class Task03 {
	
	public static void main(String[] args) {
		
		/*
		 * Задание на СОРТИРОВКУ МАССИВА (по возрастанию).
		 * Алгоритм проходит массив из 10 чисел от начала и до конца, сравнивая попарно соседние элементы, 
		 * Если элементы стоят в неправильном порядке, то они меняются местами, таким образом, 
		 * после первого прохода на конце массива оказывается максимальный элемент (для сортировки по возрастанию).  
		 * Затем проход массива повторяется, и на предпоследнем месте оказывается другой наибольший после максимального элемент и т.д. 
		 * В итоге, наименьший элемент постепенно перемещается  к началу массива. 
		 * 
		 * 
		 */
		
		int[] mas1 = {9, 32, 11, 4, 7, 1, 2, 13, 6};
		Arrays.sort(mas1);
		System.out.println("Сортировка с помощью Arrays.sort:");
		System.out.println(Arrays.toString(mas1));
		
		System.out.println("\nСортировка ВЫБОРОМ:");
		
		int[] mas = {9, 32, 11, 4, 7, 1, 2, 13, 6};
		
		for (int i = 0; i < mas.length; i++) {
			int min = mas[i];
			int min_i = i;
			for (int j = i+1; j < mas.length; j++) {
				if(mas[j] < min){
					min = mas[j];
					min_i = j;
				}
			}
			if(i != min_i){
				int temp = mas[i];
				mas[i] = mas[min_i];
				mas[min_i] = temp;
			}
		}
		System.out.println(Arrays.toString(mas));
		
		System.out.println("\nСортировка ПУЗЫРЬКОМ:");
		
		int[] mas2 = {9, 32, 11, 4, 7, 1, 2, 13, 6};
		
		for (int i = mas2.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(mas2[j] > mas2[j+1]){
					int temp = mas2[j];
					mas2[j] = mas2[j+1];
					mas2[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(mas2));
	}
}
