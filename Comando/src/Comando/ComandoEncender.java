package Comando;

public class ComandoEncender implements IComando{

	private EquipoSinido ep;
	
	public ComandoEncender(EquipoSinido ep) {
		
		this.ep = ep;
	}


	@Override
	public void ejecutar() {
		ep.encender();
	
		
	}
	
    

}
