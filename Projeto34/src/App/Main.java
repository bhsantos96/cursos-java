package App;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int  alcool = 0;
		int gasolina = 0;             //Atenção aos valores iniciais dessas variáveis pois elas devem começar com o valor zero para daí por
		int diesel = 0;               // diante começar a soma
		
		int tipo = sc.nextInt();
		
		while (tipo != 4 ) {         //Enquanto o =>TIPO DE COMBUSTÍVEL<= for diferente de 4 faça
			if (tipo == 1) {         //se a variável =>TIPO<= for igual a 1 então
				alcool = alcool + 1; //variável alcool recebe alcool(0) + 1
			}                        //atenção nessa parte pois o valor inicial sempre tem que ser 0 para somar daí por diante! =>LINHA 11<=
				else if (tipo == 2) {
			gasolina = gasolina + 1;
		}
				else if (tipo == 3) {
					diesel = diesel + 1; //Variável diesel recebe diesel que é = 0 + 1,para que comece a soma e mostre o valor correto quando
				}                        // for pedido no final do algoritmo,o mesmo vale para a variável de gasolina logo acima!
			
			tipo = sc.nextInt(); //Essa linha vai atender a parte em que o usuário informar um código inválido que não atende os quesitos acima
		            // ela irá pegar um novo valor até que o código seja encerrado (No caso receber o valor 4 que é o código para encerramento)
		}       
			System.out.println("MUITO OBRIGADO");
			System.out.println("Alcool:"+ alcool );
			System.out.println("Gasolina:"+ gasolina);
			System.out.println("Diesel:"+ diesel);
			
		sc.close();				
	}
}