package negocio;

public class Graduacao extends Curso {
	
	
	private boolean indicativo;	
	
	
	
			
	
	public Graduacao(String nome, int cargaHoraria, float valor, Coordenador coordenador, boolean indicativo) {
		
		super(nome, cargaHoraria, valor, coordenador);
		this.indicativo = indicativo;
		
	}





	public void show() {	
		
		System.out.printf("GRADUAÇÃO\n"				
				+"Técnologo: %s \n", indicativo ? "Sim" : "Não");
		super.show();
				
		
	}

}
