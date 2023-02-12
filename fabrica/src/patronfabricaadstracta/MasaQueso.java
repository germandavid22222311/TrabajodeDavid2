package patronfabricaadstracta;

public class MasaQueso implements IElementoMasa{
	
	 @Override
	    public void producir() {
	        System.out.println("Generando masa con bordes de queso");
	    }

	    @Override
	    public String getDatos() {
	        return "Masa redonda regular con bordes de queso";
	    }

}
