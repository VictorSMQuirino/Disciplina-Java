package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exceptions.JornadaSemCobradorException;

public class Jornada {
	private Date inicio;
	private Date fim;
	private Trajeto trajeto;
	private Motorista motorista;
	private Cobrador cobrador;
	private Veiculo veiculo;
	private List<PassageiroEmbarcado> passageirosEmbarcados;
	
	//Construtor para quando a jornada tiver um cobrador
	public Jornada(Trajeto trajeto, Motorista motorista, Cobrador cobrador, Veiculo veiculo) {
		super();
		this.inicio = new Date();
		this.fim = null;
		this.trajeto = trajeto;
		this.motorista = motorista;
		this.cobrador = cobrador;
		this.veiculo = veiculo;
		this.passageirosEmbarcados = new ArrayList<PassageiroEmbarcado>();
	}
	//Construtor para quando a jornada não tiver um cobrador
	public Jornada(Trajeto trajeto, Motorista motorista, Veiculo veiculo) {
		super();
		this.inicio = new Date();
		this.fim = null;
		this.trajeto = trajeto;
		this.motorista = motorista;
		this.cobrador = null;
		this.veiculo = veiculo;
		this.passageirosEmbarcados = new ArrayList<PassageiroEmbarcado>();
	}
	
	public void embarcaPassageiro(Passageiro passageiro, PontoParada ponto) {
		
	}
	public Date getInicio() {
		return inicio;
	}
	public Date getFim() {
		return fim;
	}
	public Trajeto getTrajeto() {
		return trajeto;
	}
	public Motorista getMotorista() {
		return motorista;
	}
	public Cobrador getCobrador() {
		if(cobrador != null) return cobrador;
		else throw new JornadaSemCobradorException("Esta jornada nao tem um cobrador associado a ela!");
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public List<PassageiroEmbarcado> getPassageirosEmbarcados() {
		return passageirosEmbarcados;
	}
	
	
}
