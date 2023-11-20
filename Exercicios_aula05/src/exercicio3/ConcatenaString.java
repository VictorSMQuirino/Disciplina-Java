package exercicio3;

import java.util.Scanner;

public class ConcatenaString {

	public static Scanner sc = new Scanner(System.in);
	
	public static String solicitaString() {
		System.out.print("Digite uma string: ");
		String palavra = sc.nextLine();
		return palavra;
	}
	
	public static void concatenaString(String s1, String s2) {
		System.out.println("As duas strings concatenadas: " + s1 + s2);
	}
	
	public static void main(String[] args) {
		System.out.println("Esse programa concatena duas strings!");
		String s1 = solicitaString();
		String s2 = solicitaString();
		concatenaString(s1, s2);
	}

}
