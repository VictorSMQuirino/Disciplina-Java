package exercicio5;

import java.util.Scanner;

public class ConverteTemperaturaVersao2 {
	
	public static void converteTemperatura(float temperatura, int entrada) {
		if(entrada == 0) {
			float temperaturaEmFahr = (temperatura * 9 / 5) + 32;
			System.out.println(temperatura + "ºC em Fahrenheit = " + temperaturaEmFahr);
		} else {
			float temperaturaEmCelsius = (temperatura - 32) / 1.8f;
			System.out.println(temperatura + "ºF em Celsius = " + temperaturaEmCelsius);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Voce prefere inserir uma temperatura em Celsius ou em Fahrenheit?");
		int entrada;
		
		do {
			System.out.println("Digite:");
			System.out.println("0 para Celsius");
			System.out.println("1 para Fahrenheit");
			entrada = sc.nextInt();
			if(entrada < 0 || entrada > 1) System.out.println("Digite 1 ou 2!");
		} while(entrada < 0 || entrada > 1);
		
		System.out.print("Digite um valor para a temperatura:");
		float temperatura = sc.nextFloat();
		
		converteTemperatura(temperatura, entrada);
	}

}
