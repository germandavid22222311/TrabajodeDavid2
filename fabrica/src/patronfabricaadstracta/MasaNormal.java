package patronfabricaadstracta;

public class MasaNormal implements IElementoMasa {
	@Override
    public void producir() {
        System.out.println("Generando masa normal");
    }

    @Override
    public String getDatos() {
        return "Masa redonda regular";
    }

}
