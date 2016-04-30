package Practice160430;

public class Task02 {
	
	public static void main(String[] args) {
		
		/*
		 * Создать программу, выводящую на экран ближайшее 
		 * к 10 из двух чисел, записанных в переменные m и n.
		 * Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45 
		 */
		
		
		double result = close10(8.5, 11.45);
		System.out.println(result);
		
		}
	
	static public double close10(double a, double b) {
		double aDiff = Math.abs(a - 10);
		double bDiff = Math.abs(b - 10);
		  
		  if (aDiff == bDiff) {
			return 0;
		}
		  if (aDiff < bDiff ) {
			return a;
		} else {
			return b;
		}
		
	}

}
