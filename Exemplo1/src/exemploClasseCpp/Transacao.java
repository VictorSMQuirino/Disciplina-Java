package exemploClasseCpp;

public class Transacao {
	private String data;
	private String descricao;
	private float valor;
	
	public Transacao(String data, String descricao, float valor) {
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
}
