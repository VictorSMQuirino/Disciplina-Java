package exercicio4;

import java.util.Scanner;

public class VerificaParidade {

	public static boolean verificaParidade(int numero) {
		if(numero % 2 == 0) {
			return true;
		} 
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero inteiro: ");
		int numero = sc.nextInt();
		if(verificaParidade(numero)) {
			System.out.println(numero + " eh par!");
		} else {
			System.out.println(numero + " eh impar!");
		}
	}

}
