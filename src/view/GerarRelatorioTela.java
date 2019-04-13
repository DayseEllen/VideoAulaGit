package view;

import java.util.List;

import controller.UrnaController;
import model.entidades.Candidato;

public class GerarRelatorioTela {

	
	public static void main(String[] args) {
		
		UrnaController uc = new UrnaController();
		uc.cadastrarCandidatoAction(13);
		uc.cadastrarCandidatoAction(17);
		uc.cadastrarCandidatoAction(12);
		
		uc.cadastrarVotoAction(12);
		uc.cadastrarVotoAction(17);
		uc.cadastrarVotoAction(13);
		List<Candidato> candidatos = uc.gerarRelatorioAction();		
		
		for (Candidato c : candidatos) {
			System.out.println("Candidato : " +c.getNumero() + 
					"- votos: " + c.getVotos() );
		}
	}
}
