package model;

public class Trecho {
	private PontoParada origem;
	private PontoParada destino;
	private Integer duracaoEmMinutos;
	
	public Trecho(PontoParada origem, PontoParada destino, Integer duracaoEmMinutos) {
		super();
		this.origem = origem;
		this.destino = destino;
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public PontoParada getOrigem() {
		return origem;
	}

	public PontoParada getDestino() {
		return destino;
	}

	public Integer getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}
}
