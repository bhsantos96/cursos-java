package app;

public class Main {

	public static void main(String[] args) {
		
		double x =  3.0;
		double y =  4.0;
		double z = -5.0;
		double A, B ,C ; //Variáveis para receber os resultados//
		
		A = Math.sqrt(x); //Raiz quadrada de x//
		B = Math.sqrt(y); // Raiz quadrada de y//
		C = Math.sqrt(25.0);	//valor digitado direto,pois não existe raiz quadrada de número negativo//
		
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 é = " + C);
		
		A = Math.pow(x, y); //Resultado em potênciaçao//
		B = Math.pow(x, 2.0); //Somente X elevado a 2.0//
		C = Math.pow(5.0, 2.0); //5.0 positivo elevado ao quadrado//
		
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C );
		
		A = Math.abs(x); //Valor absoluto,tirar o negativo caso ele exista//
		B = Math.abs(y); //Variável B recebe o valor absoluto de z , mesmo padrao acima//
		C = Math.abs(z);
		
		System.out.println("Valor absoluto de " + x + " = " + A);
		System.out.println("Valor absoluto de "+ y + " = " + B);
		System.out.println("Valor absoluto de "+ z + " = " + C);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
