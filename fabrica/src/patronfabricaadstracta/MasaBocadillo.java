package patronfabricaadstracta;

public class MasaBocadillo implements IElementoMasa {

	@Override
	public void producir() {
		System.out.println("Generando masa de bocadillo");
	}

	@Override
	public String getDatos() {
		
		return "Masa redonda de bocadillo";
	}

}
