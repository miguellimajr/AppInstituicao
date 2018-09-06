package teste;

import negocio.Coordenador;
import negocio.Documentacao;
import negocio.Especializacao;
import negocio.Graduacao;

public class TestaCurso {
	
	public static void main(String[] args) {
		
		Graduacao graduacao = new Graduacao("Engenharia", 480, 1000, null, false);
		Especializacao especializacao = new Especializacao("MIT Java", 220, 2000, null, 2017);
		Documentacao documentacao = new Documentacao("23.870.937-8", "123.456.387-91", "524889-5", "RJ 2579");
		Coordenador coordenador = new Coordenador("Pedro João", "joao@coodenador.com", "9999-8585", "Rua 55, Centro", documentacao);
		
		graduacao.setCoordenador(coordenador);
		especializacao.setCoordenador(coordenador);
		
		graduacao.show();
		especializacao.show();	
		
				
	}
	
	
	
	

}
