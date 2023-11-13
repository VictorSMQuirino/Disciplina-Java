package cliente;

import java.util.Scanner;

public class Cliente {
	
	private String nome;
	private String cpf;
	private int idade;
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = 0;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome, cpf;
		System.out.print("Digite o nome: ");
		nome = sc.nextLine();
		System.out.print("Digite o cpf: ");
		cpf = sc.nextLine();
		Cliente cliente = new Cliente(nome, cpf);
		System.out.println("Dados do cliente:");
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("-------------------------");
		System.out.print("Digite um novo nome: ");
		nome = sc.nextLine();
		cliente.setNome(nome);
		System.out.print("Digite um novo cpf: ");
		cpf = sc.nextLine();
		cliente.setCpf(cpf);
		System.out.print("Digite a idade: ");
		int idade = sc.nextInt();
		cliente.setIdade(idade);
		System.out.println("-------------------------");
		System.out.println("Novos dados:");
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("Idade: " + cliente.getIdade());

	}

}
