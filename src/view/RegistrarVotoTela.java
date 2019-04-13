package view;

import controller.UrnaController;

public class RegistrarVotoTela {

	public static void main(String[] args) {
		UrnaController uc = new UrnaController();
		
		uc.cadastrarCandidatoAction(13);
		uc.cadastrarCandidatoAction(17);
		uc.cadastrarCandidatoAction(12);
		
		uc.cadastrarVotoAction(12);
		uc.cadastrarVotoAction(17);
		uc.cadastrarVotoAction(13);
	}

}
