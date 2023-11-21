package App;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;  //         ↓             ↓ 
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05; // atenção quanto ao sinal → ? ←  e aos → : ← nessa linha!
		                                       // ↑    |      ↑    
		                             // Valor Verdade  |  Valor Falso                               
		
		//Variavel → Desconto ← vai receber caso preco seja menor que 20 vou querer o valor preco * 0.1
		//Caso Contrario preco * 0.05
		
		//Se fosse o Caso de usar If e Else,dentro do Else teria a condição para fazer o calculo de => desconto 0.05 <= Aula 39
		//Estrutura Condicional Ternária
		
		System.out.println(desconto);
	sc.close();	
	}

}
