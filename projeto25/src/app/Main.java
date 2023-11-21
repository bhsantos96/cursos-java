package app;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		      //Estrutura de If e Else encadeados!
		
		int x = sc.nextInt();    //Variavel guardando numero inteiro
		String dia;
		if (x == 1) {
			dia = "domingo"; //Se a variavel X for igual a 1,entao => Dia recebe Domingo <=
		} else if (x == 2) {
			dia = "segunda"; //O mesmo se aplica as demais condições abaixo 
		} else if (x == 3) {
			dia = "terca";
		} else if (x == 4) {
			dia = "quarta";
		} else if (x == 5) {
			dia = "quinta";
		} else if (x == 6) {
			dia = "sexta";
		} else if (x == 7) {
			dia = "sabado";
		} else {
			dia = "valor invalido";
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}
}
