package app;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office Desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		System.out.println("Products :");

		System.out.printf("%s ,witch price is $%.2f\n", product1, price1);
		System.out.printf("%s ,with price is $%.2f\n", product2, price2);

		System.out.print("Record :\n");
		System.out.printf("%d ,years old,code and gender %d : %s\n", age, code, gender);
		System.out.printf("Measue with eight decimal places : %.8f\n", measure);
		System.out.printf("Rouded Three Decimal Places : %.3f%n \n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Rouded Three Decimal Places : %.3f%n \n", measure);
		
	}

}
