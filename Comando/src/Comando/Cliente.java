package Comando;

import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
	
        EquipoSinido EquipoSonido = new EquipoSinido();
     
		ControlRemoto controlRemoto = new ControlRemoto(EquipoSonido);
        
        int opcion;
        do{
            opcion = Menu();
            if(opcion != 5){
                controlRemoto.SeleccionControl(opcion-1);
            }
            
        }while(opcion!=5);

	}

	public static int Menu(){
        int opcion = 0;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Encender ");
            System.out.println("2. Apagar");
            System.out.println("3. Subir volumen");
            System.out.println("4. Bajar volumen");
            System.out.println("5. Cambiarmusica");
           
        
            opcion = in.nextInt();
            if(opcion < 1 || opcion > 5){
                System.out.println("Opcion incorrecta, intente nuevamente");
            }
        }while(opcion < 1 || opcion > 5);
        return opcion;
    }

	
}
