package exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaNumeros {

	private ArrayList<Float> numeros = new ArrayList<Float>();
	
	public void novoNumero(float f) {
		numeros.add(f);
	}
	
	public void listaNumeros() {
		System.out.println("Numeros da lista:");
		for(Float f : numeros) {
			System.out.println(f);
		}
	}
	
	public void ordena() {
		Collections.sort(numeros);
	}
	
	public Float mediana() {
		int meio = numeros.size() / 2;
		if(numeros.size() % 2 != 0) return numeros.get(meio);
		else return numeros.get(meio) + numeros.get(meio - 1);
	}
	
	public void colocadoEm(int n) {
		if(numeros.size() < n) {
			System.out.println("O numero informado eh maior que o tamanho da lista!");
			return;
		}
		
		if(n <= 0) {
			System.out.println("Digite um valor maior que 0!");
			return;
		}
		
		System.out.println("O " + n + "esimo numero eh " + numeros.get(n - 1));
	}
	
	public static void main(String[] args) {
		ListaNumeros lista = new ListaNumeros();
		Scanner sc = new Scanner(System.in);
		int c = 0;
		
		do {
			System.out.println("Deseja inserir um numero na lista? (Digite 1 para sim e qualquer outro caractere para nao)");
			c = sc.nextInt();
			if(c == 1) {
				System.out.print("Dgiite um valor de ponto flutuante: ");
				float numero = sc.nextFloat();
				lista.novoNumero(numero);
			}
		} while(c == 1);
		
		lista.ordena();
		if(lista.numeros.isEmpty()) {
			System.out.println("A lista esta vazia!");
		} else {
			System.out.println("Mediana da lista = " + lista.mediana());
			System.out.print("Digite uma posicao: ");
			int posicao = sc.nextInt();
			lista.colocadoEm(posicao);
		}
	}

}
