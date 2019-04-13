package controller;

import java.util.List;

import model.CandidatoModel;
import model.entidades.Candidato;

public class UrnaController {

	private CandidatoModel cm = new CandidatoModel();
		
	public void cadastrarCandidatoAction(Integer numero) {
		cm.inserirCandidato(numero);
		// qual tela destino
	}
	
	public void cadastrarVotoAction(Integer numero) {
		Candidato c = cm.buscarCandidato(numero);
		c.setVotos(c.getVotos()+1);
		cm.atualizarCandidato(c);
		
	}
	
	public List<Candidato> gerarRelatorioAction() {
		return cm.buscarTodos();
	}
	
}
