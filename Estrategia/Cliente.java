package patronestrategia.cliente;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Cliente {

    private static Scanner in = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        double x=0;
        double y=0;
        IEstrategia operacion=null;
        do{
            opcion = Menu();
            if(opcion!=6){
                System.out.println("Ingrese primer valor: ");
                x = in.nextDouble();
                System.out.println("Ingrese segundo valor: ");
                y = in.nextDouble();
                }
            switch(opcion){
                case 1:{
                    operacion=new EstrategiaSuma();
                    break;
                }
                case 2:{
                    operacion=new EstrategiaResta();
                    break;
                }
                case 3:{
                    operacion=new EstrategiaMultiplicacion();
                    break;
                }
                case 4:{
                    operacion=new EstrategiaDivision();
                    break;
                }
                case 5:{
                	operacion=new EstrategiaAreaCuadrado();
                	break;
                }
            }
            if(opcion!=6){
                System.out.println("Resultado: "+operacion.algoritmo(x, y));
            }
            
        }while(opcion!=6);
        
    }
    
    public static int Menu(){
        int opcion = 0;
        in = new Scanner(System.in);
        do{
            System.out.println("Seleccione una de las siguientes opciones:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Area del cuadrado");
            System.out.println("6. Salir");
            opcion = in.nextInt();
            if(opcion < 1 || opcion > 6){
                System.out.println("Opcion incorrecta, intente nuevamente");
            }
            //Editado por evelyn
        }while(opcion < 1 || opcion > 6);
        return opcion;
    }
}


