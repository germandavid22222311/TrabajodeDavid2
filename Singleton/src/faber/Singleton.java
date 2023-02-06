package faber;

public class Singleton  {

    private String nombre;
    private static Singleton Singleton;

    
    private Singleton(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public static Singleton getSingletonInstance(String nombre) {
        if (Singleton == null){
            Singleton = new Singleton(nombre);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase SoyUnico");
        }
        
        return Singleton;
    }

	public char getNombre() {
		
		return 'j';
	}
    
    

}


