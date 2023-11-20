package exercicio7;

import java.util.Scanner;

public class TrocaDeVariaveis {
	
	public static void trocaVariaveisComTemp(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
		System.out.println("Variaveis trocadas com variavel temporaria: ");
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}
	
	public static void trocaVariaveisSemTemp(int x, int y) {
		x = x ^ y;
		y = y ^ x;
		x = x ^ y;
		
		System.out.println("Variaveis trocadas sem variavel temporaria: ");
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.println("Digite dois valores inteiros: ");
		System.out.print("X = ");
		x = sc.nextInt();
		System.out.print("Y = ");
		y = sc.nextInt();
		
		trocaVariaveisComTemp(x, y);
		trocaVariaveisSemTemp(x, y);
	}

}
