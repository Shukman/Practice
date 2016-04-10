package start;

public class Binary {
	public static void binarpredstav(int a){    
        int b;     
        String temp = "";  
        int a1 = a;
        while(a !=0){  
        	b = a%2;  
        	temp = b + temp;  
        	a = a/2;  
        } 
        System.out.print("Представление в двоичном виде числа " + a1 + ": " + temp + "\n");  
        int l = temp.length();
        System.out.print("Запись в столбик этого представления:\n");
        for (int i = 0; i < l; i++)
            System.out.println(temp.charAt(i));
	}  
	
	public static void main(String [] args) {  
		binarpredstav(23);  
	}  
}




















/*
//вывод в строку
for (i = 0; i < 10; i++)
    System.out.print(a[i] + " ");
//Вывод в столбик
System.out.println();
for (i = 0; i < 10; i++)
    System.out.println(a[i]);
}*/


/*
 *     static void Binar2(int b){
	    
     String y="";
     for (;b>0;){
    	if (b%2!=0){
    	    y+="1";
    	}
    	else {
    		y+="0";
    	}
        b=b/2;      
     }	   
     StringBuffer x = new StringBuffer(y);
     x=(new StringBuffer(y)).reverse();
     System.out.println(x); 
 * */