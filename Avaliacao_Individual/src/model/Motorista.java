package model;

public class Motorista extends Pessoa{
	private String cnh;
	
	public Motorista(Long id, String nome, String cpf, String cnh) {
		super(id, nome, cpf);
		this.cnh = cnh;
	}

	public String getCnh() {
		return cnh;
	}
}
