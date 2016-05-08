package Practice160508;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/*
		 * Программа 6 раз запрашивает с клавиатуры величину зарплаты за соответствующий месяц 
		(с января до июнь) и выводит накопленную сумму. 
		Если сумма всех зарплат к камому-то проходу по циклу больше 2000, следует досрочно выйти из цикла.
		В цикле для каждого месяца следует выводить его название (например, "Enter a salary in Jan")
		Названия месяцев - Jan, Feb, Mar, Apr, May, Jun.
		 * 
		 */
			
		Scanner in = new Scanner(System.in);
		
		int allSalary = 0;
		
		if(allSalary < 2000){
			System.out.print("Сумма за январь: ");
			int zaJan = in.nextInt();
			allSalary += zaJan;
			
			if(allSalary < 2000){
				System.out.print("Сумма за февраль: ");
				int zaFeb = in.nextInt();
				allSalary += zaFeb;
				
				if(allSalary < 2000){
					System.out.print("Сумма за март: ");
					int zaMar = in.nextInt();
					allSalary += zaMar;

					if(allSalary < 2000){
						System.out.print("Сумма за апрель: ");
						int zaApr = in.nextInt();
						allSalary += zaApr;
						
						if(allSalary < 2000){
							System.out.print("Сумма за мау: ");
							int zaMay = in.nextInt();
							allSalary += zaMay;
							
							if(allSalary < 2000){
								System.out.print("Сумма за июнь: ");
								int zaJun = in.nextInt();
								allSalary += zaJun;
							}
						}
					}
				}
			}
		}
		
		System.out.println("Общая сумма = " + allSalary);
		
//		allSalary = zaJan + zaFeb + zaMar + zaApr + zaMay + zaJun;
//		System.out.println("Общая сумма за 6 месяцев = " + allSalary);
//		
//		for (int i = 0; i < allSalary; i++) {
//			if(allSalary < 2000){
//				System.out.println("Сумма не превышает 2000 = " + allSalary);
//				break;
//			}
//		}
	}
}
