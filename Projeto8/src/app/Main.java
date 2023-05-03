package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		double raio = sc.nextDouble();               //Aqui vai vir o valor do raio digitado // π = 3.14159
		
		double PI = 3.14159;
		
		double area = PI * (raio*raio);   //(raio*raio)
		
		System.out.printf("A = %.4f%n",area);
		
	sc.close();	
	}

}
