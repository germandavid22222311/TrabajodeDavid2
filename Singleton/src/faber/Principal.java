package faber;

public class Principal {

	public static void main(String[] args) {
		Singleton ricardo = Singleton.getSingletonInstance("Ricardo Moya");
        Singleton ramon = Singleton.getSingletonInstance("Ramón Invarato");
        Singleton andres = Singleton.getSingletonInstance("andres Invarato");
        
        
        
        System.out.println(ramon.getNombre());
        System.out.println(ricardo.getNombre());
       

	}

}
