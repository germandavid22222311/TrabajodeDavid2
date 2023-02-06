package Comando;

public class ComandoApagar implements IComando{
	

	private EquipoSinido ep;

	public ComandoApagar(EquipoSinido ep) {
		this.ep = ep;
	}
	@Override
	public void ejecutar() {
		ep.apagar();
		
	}
	

}
