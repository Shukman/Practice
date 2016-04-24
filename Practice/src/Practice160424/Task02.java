package Practice160424;

public class Task02 {
	
	public static void main(String[] args) {
		
		/*
		 * Вывести на экран нечетные числа от 1 до 99 (цикл for в помощь!).
		 */
		
		//вариант 1:
//		for (int i = 0; i < 100; i++){
//			if (i % 2 != 0){
//				System.out.println(i);
//			}
//		}
		
		//вариант 2:
		int i = 0;
		while (i < 100){ 
			if(i % 2 == 0){
				System.out.println(i);
			}
			i++;
		}
		
	}

}
