package exercicio5;

import java.util.Scanner;

public class ConverteTemperaturaVersao1 {

	public static void fahrParaCelsius(float temperatura) {
		float temperaturaEmCelsius = (temperatura - 32) / 1.8f;
		System.out.println(temperatura + "ºF em Celsius = " + temperaturaEmCelsius);
	}
	
	public static void celciusParaFahr(float temperatura) {
		float temperaturaEmFahr = (temperatura * 9 / 5) + 32;
		System.out.println(temperatura + "ºC em Fahrenheit = " + temperaturaEmFahr);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Voce prefere inserir uma temperatura em Celsius ou em Fahrenheit?");
		int entrada;
		
		do {
			System.out.println("Digite:");
			System.out.println("1 para Celsius");
			System.out.println("2 para Fahrenheit");
			entrada = sc.nextInt();
			if(entrada < 1 || entrada > 2) System.out.println("Digite 1 ou 2!");
		} while(entrada < 1 || entrada > 2);
		
		System.out.print("Digite um valor para a temperatura:");
		float temperatura = sc.nextFloat();
		
		if(entrada == 1) celciusParaFahr(temperatura);
		else fahrParaCelsius(temperatura);
	}

}
