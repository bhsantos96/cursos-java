package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		//Esse exercício foi refeito vendo a correção,tinha esquecido de formatar o resultado final,por isso nao era mostrado//

	Locale.setDefault(Locale.US);  	
	Scanner sc = new Scanner(System.in);	
	
	int codigoP1 = sc.nextInt();
	int numeroPcs1 = sc.nextInt();
	double ValorPcs1 = sc.nextDouble();
	
	
	
	double A = numeroPcs1 * ValorPcs1; //Obs:Na correcao foi usado apenas uma linha,fazendo a multiplicacao de //
	                                      // numeroPcs1 * ValorPcs1 + numeroPcs2 * ValorPcs2 //
	                                         // tudo dentro da variavel total//

	
	int codigoP2  = sc.nextInt();
	int numeroPcs2 = sc.nextInt();
	double ValorPcs2 = sc.nextDouble();
	
	double B = numeroPcs2 * ValorPcs2;
	
	double total = A + B ;
		
	System.out.printf("Valor total a ser pago : R$%.2f%n",total); //Aqui o resultado nao estava sendo mostrado pois eu nao tinha declarado
	                                                                //R$%.2f%n antes da variavel total,para mostrar o resultado formatado
	                                                                 // por isso nao saia nada nada tela quando solicitado//
		
	//Ficar atento quanto à formação do resultado para padrao americano//
	
	
	sc.close();	
	}

}
