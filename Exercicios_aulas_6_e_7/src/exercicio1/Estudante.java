package exercicio1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Estudante {
	private String nome;
	private Date dataNascimento;
	private String cpf;

	public Estudante(String nome, String cpf) throws ParseException {
		this.nome = nome;
		this.dataNascimento = criaDataNascimento();
		this.cpf = cpf;
	}
	
	public Date criaDataNascimento() throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a data de nascimento no formato dd/MM/yyyy: ");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data = sdf.parse(sc.nextLine());
		return data;
	}
	
	public void mostraDataNascimento() {
		System.out.println("Data de nascimento: " + dataNascimento);
	}
	
	public int calculaIdade() {
		Date dataAtual = new Date();
		
		int idade = dataAtual.getYear() - dataNascimento.getYear();
		if(dataAtual.getMonth() < dataNascimento.getMonth()) idade--;
		else if(dataAtual.getMonth() == dataNascimento.getMonth() && dataAtual.getDay() < dataNascimento.getMonth()) idade--;
		
		return idade;
	}

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o nome do estudante: ");
		String nome = sc.nextLine();
		System.out.print("Informe o cpf do estudante: ");
		String cpf = sc.nextLine();
		
		Estudante estudante = new Estudante(nome, cpf);
		estudante.mostraDataNascimento();
		estudante.calculaIdade();
		
		System.out.println("Idade = " + estudante.calculaIdade());
	}

}
