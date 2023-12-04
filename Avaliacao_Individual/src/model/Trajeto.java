package model;

import java.util.ArrayList;
import java.util.List;

public class Trajeto {
	private Long id;
	private Checkpoint checkpoint;
	private List<Trecho> trechos = new ArrayList<Trecho>();
	
	public Trajeto(Long id, List<Trecho> trechos) {
		super();
		this.id = id;
		this.trechos = trechos;
	}

	public Long getId() {
		return id;
	}

	public Checkpoint getCheckpoint() {
		return checkpoint;
	}

	public List<Trecho> getTrechos() {
		return trechos;
	}
	
	public void registraCheckpoint() {
		checkpoint = new Checkpoint();
	}
}
