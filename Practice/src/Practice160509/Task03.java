package Practice160509;

import java.util.Arrays;

public class Task03 {
	
	public static void main(String[] args) {
		
		/*
		 * 
		 * Нарисовать матрицу 5 на 10. Заполнить её нулями, а границы единицами
		 * далее добавить в матрицу j 11, вместо 10 и добавить крест в виде 1
		 */
		
		int[][] matrix = new int[5][11];
		
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[0][j] = 1;
				matrix[4][j] = 1;

				matrix[i][0] = 1;
				matrix[i][10] = 1;
			
				matrix[matrix.length / 2][j] = 1; 			//универсальное решение
				matrix[i][matrix[i].length / 2] = 1;
				
//				matrix[2][j] = 1; разовое решение
//				matrix[i][5] = 1;
				
				
//				matrix[1][0] = 1;
//				matrix[2][0] = 1;
//				matrix[3][0] = 1;
//				matrix[1][9] = 1;
//				matrix[2][9] = 1;
//				matrix[3][9] = 1;
//				
			}
		}
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		
	}
}
