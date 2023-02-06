package division;

import java.util.Iterator;
import java.util.ArrayList;

public class Division1 {

	public static void main(String[] args) {
		Division d = new Division ("La Agencia");
		d.add("Trabajador 1");
		d.add("Trabajador 2");
		
		Iterator<Empleado> iterator = (Iterator<Empleado>) d.iterator();
		while (iterator.hasNext()) {
			Empleado e= (Empleado) iterator.next();
			e.print();
			
		}
		

	}

}
