package Comando;

public class ComandoBajarVolumen implements IComando{
	
	private EquipoSinido ep;

	public ComandoBajarVolumen(EquipoSinido ep) {
		this.ep = ep;
	}

	@Override
	public void ejecutar() {
		ep.bajarVolumen();
		
	}

}
