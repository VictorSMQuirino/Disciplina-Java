package exercicio6;

import java.util.Scanner;

public class CalculaAreaTriangulo {
	
	public static float calculaArea(float largura, float altura) {
		return largura * altura / 2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float largura, altura;
		
		System.out.print("Digite a largura do triangulo: ");
		largura = sc.nextFloat();
		System.out.print("Digite a altura do triangulo: ");
		altura = sc.nextFloat();
		System.out.println("A area do triangulo = " + calculaArea(largura, altura));
	}

}
