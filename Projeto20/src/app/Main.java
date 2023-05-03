package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int produto = sc.nextInt(); 
		int quantidade = sc.nextInt();		
		
		double cachorroquente = 4.00;
		double xsalada = 4.50;
		double xbacon = 5.00;
		double torradasimples = 2.00;
		double refrigerante = 1.50;
		
		double valorTotal1 = cachorroquente * quantidade;
		double valorTotal2 = (xsalada * quantidade);
		double valorTotal3 = (xbacon * quantidade);
		double valorTotal4 = (torradasimples * quantidade);
		double valorTotal5 = (refrigerante * quantidade);
		
		if (produto == 1) {
			System.out.printf("Total : %.2f%n",valorTotal1 );
		}
		else
			if (produto == 2) {
				System.out.printf("Total : %.2f%n",valorTotal2);
			}
				else
					if(produto == 3) {
						System.out.printf("total : %.2f%n",valorTotal3);
					}
						else
							if(produto == 4) {
								System.out.printf("Total : %.2f%n",valorTotal4);
							}
								else
									System.out.printf ("Total : %.2f%n",valorTotal5);
		sc.close();
								}
  
}
