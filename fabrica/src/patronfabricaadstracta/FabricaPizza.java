package patronfabricaadstracta;

import java.util.Scanner;

public class FabricaPizza implements IFabrica{
private IElementoMasa masa;
private IElementoSabor sabor;
private static Scanner in = new Scanner(System.in);

@Override
public void crearElementos() {
    int opcion;
    System.out.println("Fabricando su pizza");
    do{
        System.out.println("Selecciones el tipo de masa para su pizza");
        System.out.println("1. Masa regular");
        System.out.println("2. Masa con bordes de queso");
        opcion = in.nextInt();
    }while(opcion < 1 || opcion>2);
    
    if(opcion==1)
        masa = new MasaNormal();
    else
        masa = new MasaQueso();
    
    masa.producir();
    
    do{
        System.out.println("Selecciones el tipo de sabor para su pizza");
        System.out.println("1. Hawaiana");
        System.out.println("2. Americana");
        opcion = in.nextInt();
    }while(opcion < 1 || opcion>2);
    
    if(opcion == 1)
        sabor = new SaborHawaiana();
    else
        sabor = new SaborAmericana();
    
    sabor.seleccion(); 
}

@Override
public IElementoMasa getElementoMasa() {
    return masa;
}

@Override
public IElementoSabor getElementoSabor() {
    return sabor;
}

}


