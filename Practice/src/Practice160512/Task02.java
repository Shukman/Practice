package Practice160512;

import java.util.Scanner;

public class Task02 {
	
	public static void main(String[] args) {
		
		/*
		 * Написать программу для проверки знаний по элементарной географии
		 * Задается 10 вопросов:
		 * "Москва - столица России?"	
		 * "США в Южной Америке?"
		 * "Лондон столица Франции?" 
		 * "Польша больше чем Россия?"
		 * "Днепр - река в Украине?" 
		 * "Париж-город в Германии?" 
		 * "Санкт-Петербург и Париж на одном континенте?" 
		 * "Рим- столица Франции?"
		 * "Канада расположена рядом с Россией?" 
		 * "Вашингтон столица Канады?"
		 * Ответы - y/n. 
		 * Затем выводится число правильных ответов, число вопросов и результирующая оценка:
		 * до 6 вкл. - very bad
		 * 7- bad
		 * 8- so-so
		 * 9- good
		 * 10-excellent
		 * 
		 */
		Scanner in = new Scanner(System.in);
		
		//Вариант 1
		int count = 0;
		System.out.print("Москва - столица России? Y/N ");
		String otv1 = in.next();
		if(otv1.equals("Y")) {
			count++;
		}

		System.out.print("США в Южной Америке? Y/N ");
		String otv2 = in.next();
		if(otv2.equals("N")) {
			count++;
		}
		
		System.out.print("Лондон столица Франции? Y/N ");
		String otv3 = in.next();
		if(otv3.equals("N")) {
			count++;
		}
		
		System.out.print("Польша больше чем Россия? Y/N ");
		String otv4 = in.next();
		if(otv4.equals("N")) {
			count++;
		}
		
		System.out.print("Днепр - река в Украине? Y/N ");
		String otv5 = in.next();
		if(otv5.equals("Y")) {
			count++;
		}
		
		System.out.print("Париж-город в Германии? Y/N ");
		String otv6 = in.next();
		if(otv6.equals("N")) {
			count++;
		}
		
		System.out.print("Санкт-Петербург и Париж на одном континенте? Y/N ");
		String otv7 = in.next();
		if(otv7.equals("Y")) {
			count++;
		}
		
		System.out.print("Рим- столица Франции? Y/N ");
		String otv8 = in.next();
		if(otv8.equals("N")) {
			count++;
		}
		
		System.out.print("Канада расположена рядом с Россией? Y/N ");
		String otv9 = in.next();
		if(otv9.equals("N")) {
			count++;
		}
		
		System.out.print("Вашингтон столица Канады? Y/N ");
		String otv10 = in.next();
		if(otv10.equals("N")) {
			count++;
		}
		
		//Вариант 2
//		int count = 0;
//		System.out.print("Москва - столица России? 1-Y/0-N ");
//		int otv1 = in.nextInt();
//		if(otv1 == 1) {
//			count++;
//		}
//
//		System.out.print("США в Южной Америке? 1-Y/0-N ");
//		int otv2 = in.nextInt();
//		if(otv2 == 0) {
//			count++;
//		}
//		
//		System.out.print("Лондон столица Франции? 1-Y/0-N ");
//		int otv3 = in.nextInt();
//		if(otv3 == 0) {
//			count++;
//		}
//		
//		System.out.print("Польша больше чем Россия? 1-Y/0-N ");
//		int otv4 = in.nextInt();
//		if(otv4 == 0) {
//			count++;
//		}
//		
//		System.out.print("Днепр - река в Украине? 1-Y/0-N ");
//		int otv5 = in.nextInt();
//		if(otv5 == 1) {
//			count++;
//		}
//		
//		System.out.print("Париж-город в Германии? 1-Y/0-N ");
//		int otv6 = in.nextInt();
//		if(otv6 == 0) {
//			count++;
//		}
//		
//		System.out.print("Санкт-Петербург и Париж на одном континенте? 1-Y/0-N ");
//		int otv7 = in.nextInt();
//		if(otv7 == 1) {
//			count++;
//		}
//		
//		System.out.print("Рим- столица Франции? 1-Y/0-N ");
//		int otv8 = in.nextInt();
//		if(otv8 == 0) {
//			count++;
//		}
//		
//		System.out.print("Канада расположена рядом с Россией? 1-Y/0-N ");
//		int otv9 = in.nextInt();
//		if(otv9 == 0) {
//			count++;
//		}
//		
//		System.out.print("Вашингтон столица Канады? 1-Y/0-N ");
//		int otv10 = in.nextInt();
//		if(otv10 == 0) {
//			count++;
//		}
		
		
		System.out.println("счетчик = " + count);
		
		String ocenka = "";
		if(count <= 6){
			ocenka = "very bad";
		}
		if(count == 7){
			ocenka = "bad";
		}
		if(count == 8){
			ocenka = "so-so";
		}
		if(count == 9){
			ocenka = "good";
		}
		if(count == 10){
			ocenka = "excellent";
		}
		System.out.println("Оценка = " + ocenka);
	}
}
