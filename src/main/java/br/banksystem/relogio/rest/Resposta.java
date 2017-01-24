package br.banksystem.relogio.rest;

public class Resposta {

	private static final int DISTACIA_EM_GRAUS_NUM_RELOGIO = 30;
	private static final int MINUTO_VOLTA_COMPLETA_RELOGIO = 60;
	private static final int GRAU_VOLTA_COMPLETA_RELOGIO = 360;
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
		long grauA = hora * DISTACIA_EM_GRAUS_NUM_RELOGIO + ((min * DISTACIA_EM_GRAUS_NUM_RELOGIO) / MINUTO_VOLTA_COMPLETA_RELOGIO);
		
		//ponteiro maior
		long grauB = (GRAU_VOLTA_COMPLETA_RELOGIO * min) / MINUTO_VOLTA_COMPLETA_RELOGIO;
		
		this.angle = Math.abs((grauB - grauA));
	}

	
}
