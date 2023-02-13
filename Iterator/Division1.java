package division;

import java.util.Iterator;
import java.util.ArrayList;

public class Division1 {

	public static void main(String[] args) {
		Division d = new Division ("La Empresa");
		d.add("Trabajador 12");
		d.add("Trabajador 23");
		
		Iterator<Empleado> iterator = (Iterator<Empleado>) d.iterator();
		while (iterator.hasNext()) {
			Empleado e= (Empleado) iterator.next();
			e.print();
			
		}
		

	}

}
