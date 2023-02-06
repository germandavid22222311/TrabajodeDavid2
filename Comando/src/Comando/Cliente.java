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
            System.out.println("1. Encender el equipo");
            System.out.println("2. Apagar el equipo");
            System.out.println("3. Subir el volumen");
            System.out.println("4. Bajar el volumen");
            System.out.println("5. Carbiarmusica");
           
        
            opcion = in.nextInt();
            if(opcion < 1 || opcion > 5){
                System.out.println("Opcion incorrecta, netnte nuevamente");
            }
        }while(opcion < 1 || opcion > 5);
        return opcion;
    }

	
}
