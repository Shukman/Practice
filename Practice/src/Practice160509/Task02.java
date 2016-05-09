package Practice160509;

public class Task02 {
	
	public static void main(String[] args) {
		
		/*
		 * "таблица умножения" для всех чисел от 12 до 1 (в обратном порядке) 
			(использовать  вложенный цикл)
		 */
		int count = 0;
		for (int i = 12; i > 0; i--) {
			for (int j = 12; j > 0; j--) {
				System.out.println(i + " * " + j + " = " + i * j);
				if(j == 1) {
					System.out.println();
				}
			}
		}
	}
}
