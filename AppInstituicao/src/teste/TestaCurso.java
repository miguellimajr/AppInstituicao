package teste;

import negocio.Especializacao;
import negocio.Graduacao;

public class TestaCurso {
	
	public static void main(String[] args) {
		
		Graduacao graduacao = new Graduacao("Engenharia", 480, 1000, false);
		Especializacao especializacao = new Especializacao("MIT Java", 220, 2000, 2017);
		
		
		graduacao.show();
		especializacao.show();	
		
				
	}
	
	
	
	

}
