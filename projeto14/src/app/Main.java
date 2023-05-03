package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int hora;
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if (hora < 12) {                         //Estrutura condicional composta,por isso também é chamada de estrutura de controle//
			System.out.println("Bom dia");       //Vou controlar se vou imprimir *bom dia ou * boa tarde dependendo da condicao que estiver no cógigo//
		}
		else if (hora < 18) {
		   	System.out.println("Boa Tarde");
		}
		else {                                  //=> Else <= nunca tem uma condicao! Somente o => If <= que possui condição! 
		   	System.out.println("Boa Noite");
		}                                            //Utilizar a tecla TAB ajuda na endentação!
			                                         //If = Se
			                                         //Else = Senão
	    
        sc.close();                                   //Em caso de alguma dúvida ver aula 33 aos 15:33 minutos em diante!//
	}                                                 //No material de apoio (seção 5) contem 4 possibilidades de If e Else encadeadas!//
}
