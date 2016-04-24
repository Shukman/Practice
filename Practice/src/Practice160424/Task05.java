package Practice160424;

public class Task05 {
	
	public static void main(String[] args) {
		
		/*
		* Перепишите код, заменив цикл for на while, без изменения поведения цикла.
		*	for (int i = 0; i < 3; i++) {
  		*	System.out.println( "номер " + i + "!" );
		*	}
		*/
		
		int i = 0;
		while(i < 3){
			System.out.println("номер " + i + "!");
			i++;
		}

		System.out.println();
		
		for (int i1 = 0; i1 < 3; i1++) {
			System.out.println( "номер " + i1 + "!" );
		}
	}
}

