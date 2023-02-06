package faber;

public class Principal {

	public static void main(String[] args) {
		Singleton ricardo = Singleton.getSingletonInstance("Ricardo Moya");
        Singleton ramon = Singleton.getSingletonInstance("Ramón Invarato");
        
        
        System.out.println(ramon.getNombre());
        System.out.println(ricardo.getNombre());

	}

}
