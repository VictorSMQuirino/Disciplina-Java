package model;

public class PassageiroEmbarcado {
	private Passageiro passageiro;
	private PontoParada pontoParada;
	
	public PassageiroEmbarcado(Passageiro passageiro, PontoParada pontoParada) {
		super();
		this.passageiro = passageiro;
		this.pontoParada = pontoParada;
	}
	
	public Passageiro getPassageiro() {
		return passageiro;
	}
	
	public PontoParada getPontoParada() {
		return pontoParada;
	}
}