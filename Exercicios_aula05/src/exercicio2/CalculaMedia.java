package exercicio2;

import java.util.Scanner;

public class CalculaMedia {

	public static void calculaMedia(float n1, float n2, float n3, float p1, float p2, float p3) {
		float media = n1 * (p1 / 10) + n2 * (p2 / 10) + n3 * (p3 / 10);
		System.out.println("Media = " + String.format("%.2f", media));
	}
	
	public static void main(String[] args) {
		float nota1 = 0.0f, nota2 = 0.0f, nota3 = 0.0f, peso1 = 0.0f, peso2 = 0.0f, peso3 = 0.0f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe as notas e os pesos para calcular a media ponderada:");
		do {
			System.out.print("Nota 1 = ");
			nota1 = sc.nextFloat();
			if(nota1 < 0 || nota1 > 10) {
				System.out.println("Informe um valor entre 0.0 e 10.0 para a nota!");
			}
		} while(nota1 < 0 || nota1 > 10);
		
		do {
			System.out.print("Nota 2 = ");
			nota2 = sc.nextFloat();
			if(nota2 < 0 || nota2 > 10) {
				System.out.println("Informe um valor entre 0.0 e 10.0 para a nota!");
			}
		} while(nota2 < 0 || nota2 > 10);
		
		do {
			System.out.print("Nota 3 = ");
			nota3 = sc.nextFloat();
			if(nota3 < 0 || nota3 > 10) {
				System.out.println("Informe um valor entre 0.0 e 10.0 para a nota!");
			}
		} while(nota3 < 0 || nota3 > 10);
		
		do {
			System.out.print("Peso 1 = ");
			peso1 = sc.nextFloat();
			System.out.print("Peso 2 = ");
			peso2 = sc.nextFloat();
			System.out.print("Peso 3 = ");
			peso3 = sc.nextFloat();
			
			if(peso1 + peso2 + peso3 != 10.0f) {
				System.out.println("A soma dos pesos deve ser igual a 10.0!");
			}
		} while(peso1 + peso2 + peso3 != 10.0f);
		
		calculaMedia(nota1, nota2, nota3, peso1, peso2, peso3);
		
	}

}
