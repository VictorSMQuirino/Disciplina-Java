package model;

import java.util.Date;

public class Checkpoint {
	private Date hora;
	
	public Checkpoint() {
		hora = new Date();
	}
	
	public Date getHora() {
		return hora;
	}
}
