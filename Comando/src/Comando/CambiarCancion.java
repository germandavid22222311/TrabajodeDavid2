package Comando;

public class CambiarCancion implements IComando {
	
	private EquipoSinido ep;

	public CambiarCancion(EquipoSinido ep) {
		this.ep = ep;
	}

	@Override
	public void ejecutar() {
		ep.cambiarCancion();
		
	}
	

}
