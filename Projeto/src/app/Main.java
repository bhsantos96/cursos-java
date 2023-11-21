package app;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		                // => Estrutura switch case <=
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		switch (x) {       //Aqui irá avaliar a expressão X que coloquei
		case 1:            //Caso valor de X seja => 1 <=,vou atribuir para a variável X o valor => Domingo <=
			dia = "domingo";
			break;
		case 2:               //Segue o mesmo padrão logo abaixo
			dia = "segunda";
			break;            //Obs: toda vez em que se usa um => switch <= é obrigatório você usar um => break <=  no final de cada caso!
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:                        //Funciona do mesmo modo que um monte de If e Else
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:                     //No final caso quiser estabelecer um valor final caso todas as alternativas anteriores tiverem
			dia = "valor invalido";   // falhado se usa a palavra => default : >>(default + :)<< <= e ai você executa o que quiser!
			break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}
}