package br.banksystem.relogio.rest;

public class Resposta {

	private long angle;
	
	public long getAngle() {
		return angle;
	}

	public void setAngle(long angle) {
		this.angle = angle;
	}
	
	
	public Resposta(long hora, long min) {
		
		//ponteiro menor
		if(hora >= 12){
			hora = hora - 12;
		} 
		long grauA = hora * 30 + ((min * 30) / 60);
		
		//ponteiro maior
		long grauB = (360 * min) / 60;
		
		this.angle = Math.abs((grauB - grauA));
	}

	
}
