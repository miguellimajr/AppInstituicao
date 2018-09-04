package negocio;

public class Especializacao extends Curso{
	
		
		private int anoTermino;		
	
	
	public Especializacao(String nome, int cargaHoraria, float valor, int anoTermino) {
			super(nome, cargaHoraria, valor);
			this.anoTermino = anoTermino;
		}



	public void show() {	
		
		System.out.printf("ESPECIALIZAÇÃO\n"					
				+"Ano término: %d \n", anoTermino);	
		super.show();
		
	}
	

}
