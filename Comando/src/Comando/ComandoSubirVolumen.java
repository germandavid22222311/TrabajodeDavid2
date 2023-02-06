package Comando;

public class ComandoSubirVolumen implements IComando {
	
	private EquipoSinido ep;

	public ComandoSubirVolumen(EquipoSinido ep) {
		this.ep = ep;
	}

	@Override
	public void ejecutar() {
		ep.subirVolumen();
		
	}
	

}
