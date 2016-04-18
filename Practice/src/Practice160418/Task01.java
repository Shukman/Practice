package Practice160418;

public class Task01 {
	
	public static void main(String[] args) {
		
		
		String Hello = "Hello, World!";
		System.out.println(Hello.length());
		System.out.println(Hello);
		
		System.out.println("вариант 1");
		Hello = Hello.substring(0, 8) + "ORLD!";
		System.out.println(Hello);
		
		int Hello_01 = Hello.codePointAt(7);
		System.out.println(Hello_01);
		
		System.out.println((char)87);
		
		
		System.out.println("вариант 2");
		System.out.println(Hello.toLowerCase());
		System.out.println(Hello.toUpperCase());
		
		System.out.println("вариант 3");
		System.out.println(Hello.replace("WORLD", "wOrlD"));
		
		System.out.println("вариант 4");
		System.out.println(Hello);
		String Hello_02 = Hello.substring(0, 8) + Hello.substring(8, 13).toLowerCase();
		System.out.println(Hello_02);
		
	}

}
