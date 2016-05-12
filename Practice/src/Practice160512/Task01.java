package Practice160512;

public class Task01 {
	
	public static void main(String[] args) {
		
		/*
		 * Написать функцию writeArray с возвращаемым типом void, принимающую на вход 
		 * массив целых чисел и его длину и выводящий на экран элементы массива, каждый в 
 		 * отдельной строке, перед каждым элементом - индекс массива.
		 *  
		 */
		int[] mas = {6, 2, 7, 4};
		int dl = mas.length;
		
		writeArray(mas, dl);
	}

	private static void writeArray(int[] a, int b) {
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Индекс массива: " + i + " = " + a[i]);
		}
	}
}
