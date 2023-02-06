package Comando;

public class ControlRemoto {
	
    private IComando[] comandos = new IComando[5]; 
    public ControlRemoto(EquipoSinido ep){
        comandos[0] = new ComandoEncender(ep);
        comandos[1] = new ComandoApagar(ep);
        comandos[2] = new ComandoSubirVolumen(ep);
        comandos[3] = new ComandoBajarVolumen(ep);
        comandos[4] = new CambiarCancion(ep);
      
    } 
    public void SeleccionControl(int pIndice){
        comandos[pIndice].ejecutar();
    }   


	
	
	
	
	
}
