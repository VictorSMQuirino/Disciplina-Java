package model;

import java.util.Date;

public class Passageiro extends Pessoa{
	private Date dataNascimento;
	private String cartao;
	
	public Passageiro(Long id, String nome, String cpf, Date dataNascimento, String cartao) {
		super(id, nome, cpf);
		this.dataNascimento = dataNascimento;
		this.cartao = validaCartao(cartao);
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public String getCartao() {
		return cartao;
	}
	
	public void setCartao(String cartao) {
		
	}
	
	public int idade() {
		//Método para calcular a idade do passageiro de acordo com a data de nascimento
	}
	
	public String validaCartao(String cartao) {
		/*Método para validar se o cartão do usuário está de acordo com a idade.
		 * Se o cartão passado for de idoso, será valido se a idade do passageiro for maior ou igual a 60
		 */
	}
}
