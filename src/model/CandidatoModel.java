package model;

import java.util.ArrayList;
import java.util.List;

import model.entidades.Candidato;

public class CandidatoModel {

	List<Candidato> candidatos = new ArrayList<>();	
	
	public void inserirCandidato(Integer numero) 
	{
		if (this.buscarCandidato(numero) == null ) {
			Candidato c = new Candidato(numero, 0);
			this.candidatos.add(c);
		}
	}
	
	public Candidato buscarCandidato(Integer numero) {
		return null;
	}
	
	public void atualizarCandidato(Candidato c) {
		
	}
	
	public List<Candidato> buscarTodos() {
		return null;
	}
}
