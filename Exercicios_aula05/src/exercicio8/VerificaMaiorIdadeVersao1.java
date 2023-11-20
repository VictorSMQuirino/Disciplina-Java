package exercicio8;

import java.util.Scanner;

public class VerificaMaiorIdadeVersao1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		if(idade >= 18) System.out.println("Voce eh maior de idade!");
		else System.out.println("Voce nao eh maior de idade!");

	}

}
