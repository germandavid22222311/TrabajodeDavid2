package patronfabricaadstracta;

import patronfabricaadstracta.FabricaPizza;
import patronfabricaadstracta.IElementoMasa;
import patronfabricaadstracta.IElementoSabor;
import patronfabricaadstracta.IFabrica;

@SuppressWarnings("unused")

public class Principal {
	
public static void main(String[] args) {
        
        IFabrica miFabrica = new FabricaPizza();
        
        miFabrica.crearElementos();
        IElementoMasa miMasa = miFabrica.getElementoMasa();
        IElementoSabor miSabor = miFabrica.getElementoSabor();
        System.out.println("Mi Pizza tiene: "+miMasa.getDatos()+miSabor.getInformacion());
    }

}
