package patronestrategia.cliente;

import java.util.Scanner;

public class IEstrategia {
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
	                System.out.println("Ingrese el primer valor: ");
	                x = in.nextDouble();
	                System.out.println("Ingrese el segundo valor: ");
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
	            System.out.println("1. Sumar1");
	            System.out.println("2. Restar2");
	            System.out.println("3. Multiplicar3");
	            System.out.println("4. Dividir4");
	            System.out.println("5. Area del cuadrado5");
	            System.out.println("6. salir6");
	            opcion = in.nextInt();
	            if(opcion < 1 || opcion > 6){
	                System.out.println("Opcion incorrecta, intente nuevamente");
	            }
	        }while(opcion < 1 || opcion > 6);
	        return opcion;
	    }

		public double algoritmo(double x, double y) {
			// Cambiado por evelyn
			//lunes
			return 0;
		}
	}




