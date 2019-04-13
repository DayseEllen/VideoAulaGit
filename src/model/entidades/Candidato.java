package model.entidades;

public class Candidato {
	
	private int numero;
	private int votos;

	public Candidato(int numero, int votos) {
		this.numero = numero;
		this.votos = votos;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		this.votos = votos;
	}
	
}
