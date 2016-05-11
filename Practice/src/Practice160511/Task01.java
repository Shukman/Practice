package Practice160511;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
	
	public static void main(String[] args) {
		
		/*
		 * Создать 2-мерный массив целых чисел 4х4. Заполнить массив с клавиатуры.
		 *	Вывести массив на экран с указанием индекса каждой строки, каждая строка отдельно.
		 *	Затем:
		 *	В строке с индексом 1 возвести все элементы в квадрат.
		 *	В строке с индексом 3 присвоить каждому элементу n-й колонки сумму значений 
		 *	элементов n-й колонки из 0-й и 2-й колонок.
		 *	После изменений вывести массив на экран с указанием индекса каждой строки, 
		 *	каждая строка отдельно.
		 *	ПРИМЕР
		 *	Before changes
		 *	row0	5	8	7	-2
		 *	row1	2	8	0	-7
		 *	row2	0	1	10	0
		 *	row3	2	1	8	45
		 *	After changes =======================
		 *	row0	5	8	7	-2
		 *	row1	4	64	0	49
		 *	row2	0	1	10	0
		 *	row3	5	9	17	-2
		 * 
		 */
		Scanner in = new Scanner(System.in);
		
		//вариант 1
//		System.out.print("Введите число num00: ");
//		int num00 = in.nextInt();
//		System.out.print("Введите число num01: ");
//		int num01 = in.nextInt();
//		System.out.print("Введите число num02: ");
//		int num02 = in.nextInt();
//		System.out.print("Введите число num03: ");
//		int num03 = in.nextInt();
//		
//		System.out.print("Введите число num10: ");
//		int num10 = in.nextInt();
//		System.out.print("Введите число num11: ");
//		int num11 = in.nextInt();
//		System.out.print("Введите число num12: ");
//		int num12 = in.nextInt();
//		System.out.print("Введите число num13: ");
//		int num13 = in.nextInt();
//		
//		System.out.print("Введите число num20: ");
//		int num20 = in.nextInt();
//		System.out.print("Введите число num21: ");
//		int num21 = in.nextInt();
//		System.out.print("Введите число num22: ");
//		int num22 = in.nextInt();
//		System.out.print("Введите число num23: ");
//		int num23 = in.nextInt();
//		
//		System.out.print("Введите число num30: ");
//		int num30 = in.nextInt();
//		System.out.print("Введите число num31: ");
//		int num31 = in.nextInt();
//		System.out.print("Введите число num32: ");
//		int num32 = in.nextInt();
//		System.out.print("Введите число num33: ");
//		int num33 = in.nextInt();
//		
//		int[][] matrix = {
//				{num00, num01, num02, num03},
//				{num10, num11, num12, num13},
//				{num20, num21, num22, num23},
//				{num30, num31, num32, num33},
//		};
//		
//		for (int i = 0; i < matrix.length; i++) {
//			System.out.println(Arrays.toString(matrix[i]));
//		}
//		System.out.println("num00 = " + matrix[0][0] + " num01 = " + matrix[0][1] + " num02 = " + matrix[0][2] + " num03 = " + matrix[0][3] + 
//				"\nnum10 = " + matrix[1][0] + " num11 = " + matrix[1][1] + " num12 = " + matrix[1][2] + " num13 = " + matrix[1][3] + 
//				"\nnum20 = " + matrix[2][0] + " num21 = " + matrix[2][1] + " num22 = " + matrix[2][2] + " num23 = " + matrix[2][3] + 
//				"\nnum30 = " + matrix[3][0] + " num31 = " + matrix[3][1] + " num32 = " + matrix[3][2] + " num33 = " + matrix[3][3]);
//		
//		System.out.println();
//		
//		System.out.println("num00 = " + matrix[0][0] + " num01 = " + matrix[0][1] + " num02 = " + matrix[0][2] + " num03 = " + matrix[0][3] + 
//				"\nnum10 = " + matrix[1][0]*matrix[1][0] + " num11 = " + matrix[1][1]*matrix[1][1] + " num12 = " + matrix[1][2]*matrix[1][2] + " num13 = " + matrix[1][3]*matrix[1][3] + 
//				"\nnum20 = " + matrix[2][0] + " num21 = " + matrix[2][1] + " num22 = " + matrix[2][2] + " num23 = " + matrix[2][3] + 
//				"\nnum30 = " + (matrix[0][0]+matrix[2][0]) + " num31 = " + (matrix[0][1]+matrix[2][1]) + " num32 = " + (matrix[0][2]+matrix[2][2]) + " num33 = " + (matrix[0][3]+matrix[2][3]));
//					
		//вариант 2
		int row = 4;
		int colm = 4;
		int[][] matrix = new int[row][colm];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < colm; j++) {
				
				System.out.print("Введите значение [" + i + "]" + "[" + j + "] = ");
				int num = in.nextInt();
				
				matrix[i][j] = num;
			}
		}
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		System.out.println();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < colm; j++) {
				System.out.println("matrix[" + i + "]" + "[" + j + "] = " + matrix[i][j]);
			}
		}
		System.out.println();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < colm; j++) {
//				неправильный вывод значений!(уточнить)
//				matrix[1][j] = matrix[1][j] * matrix[1][j];
//возведение 1 строки в квадратную степень
				if(i == 1) {
					matrix[i][j] *= matrix[i][j];
				}
				
//присвоить строке 3 сумму значений строк 0 и 2
				if(i == 3) {
					matrix[i][j] = matrix[0][j] + matrix[2][j];
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		}
	}


