package calculadora;

import java.util.Scanner;

public class CalculadoraSimples {
	
	public static void operacao(double x,  double y, int opcao) {
		String resultado = "Resultado = ";
		if(opcao == 1) resultado += x + y;
		else if(opcao == 2) resultado += x - y;
		else if(opcao == 3) resultado += x * y;
		else if(opcao == 4) resultado += x / y;
		else {
			System.out.println("Operador invalido!");
			return;
		}
		
		System.out.println(resultado);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		double n1 = sc.nextDouble();
		System.out.print("Digite outro numero: ");
		double n2 = sc.nextDouble();
		System.out.println("Digite uma opcao:");
		System.out.println("1 para adicao");
		System.out.println("2 para subtracao");
		System.out.println("3 para multiplicacao");
		System.out.println("4 para divisao");
		int operador = sc.nextInt();
		operacao(n1, n2, operador);
	}

}
