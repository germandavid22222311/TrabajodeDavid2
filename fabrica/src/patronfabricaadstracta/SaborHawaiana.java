package patronfabricaadstracta;

public class SaborHawaiana implements IElementoSabor{
	 @Override
	    public void seleccion() {
	        System.out.println("Se selecciono pizza Hawaiana");
	    }

	    @Override
	    public String getInformacion() {
	        return " con cebolla, pimentón, champiñon, piña y tomate";
	    }

}
