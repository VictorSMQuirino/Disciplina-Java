package model;

public class Pessoa {
	private Long id;
	private String nome;
	private String cpf;
	private static Long contador = 0L;
	
	public Pessoa(Long id, String nome, String cpf) {
		super();
		this.id = ++contador;
		this.nome = nome;
		this.cpf = cpf;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
}
