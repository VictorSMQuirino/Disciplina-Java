package exemploClasseCpp;

import java.util.ArrayList;

public class Conta {
	private int numeroConta;
	private String nomeCorrentista;
	private float saldo;
	private ArrayList<Transacao> transacoes;
	
	public void deposito(float valor) {
		this.saldo += valor;
	}
	
	public void retirada(float valor) {
		if(this.saldo >= valor) this.saldo -= valor;
	}
	
	public void imprimirExtrato() {
		for(Transacao t : transacoes) {
			System.out.println("------------------");
			System.out.println(t.getData());
			System.out.println(t.getValor());
			System.out.println(t.getDescricao());
		}
		System.out.println("------------------");
	}

	public String getNomeCorrentista() {
		return nomeCorrentista;
	}

	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public float getSaldo() {
		return saldo;
	}
}
