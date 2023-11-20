package exercicio1;

import java.util.Scanner;

public class SomaNumerosInteiros {

	public static void soma(int x, int y) {
		System.out.println("Soma = " + (x + y));
	}
	
	public static void main(String[] args) {
		int x, y;
		
		System.out.println("Digite dois numeros inteiros:");
		System.out.print("X = ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		System.out.print("Y = ");
		y = sc.nextInt();
		soma(x, y);
	}
}
