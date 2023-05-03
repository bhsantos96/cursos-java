package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble(); //Ja foi declarado a variavel e na mesma linha ja foi feita a leitura,segue o mesmo padrao abaixo//
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		   //   Tambem pode ser declaradas as variaveis dessa forma! Questão de preferência!
	       //Ex: Double Largura,Comprimento
		   //    Double Comprimento
           //    Largura = sc.next.Double();
		   //    Comprimento = sc.nextDouble(); //
		 
		double area = largura * comprimento;   //Foi criada uma variavel para poder fazer esse calculo//
		double preco = area * metroQuadrado;           //Foi criada uma variavel para poder fazer esse calculo//
		
		
		System.out.printf("Area = %.2f%n", area);       //Println é usado para concatenar resultados,para se mostrar resultados formatados se usa o Printf //
		System.out.printf("Preco = %.2f%n", preco);     //Exemplo com Println = System.out.println("Preco = "+ preco);
		                                                //Exemplo com Printf  = System.out.println("Preco = %.2f%n", preco);
														//Ao usar o Printn usa-se o "+" para concatenar o que foi escrito com as variaveis
		                                                //Ja o Printf se usa "%.2f" para se especificar o tamanha da formatacao desejada
		                                                // e logo depois se usa o "%n" EX: " %.2f%n " para se ter uma quebra de linha ao mostrar o
		                                                //  resultado! No caso so especificar quantas casas decimas que você deseja que o resultado
		                                                //   seja formatado! 
		
		
		sc.close();

	}

}
