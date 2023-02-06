package patronestrategia.cliente;

public class EstrategiaDivision extends IEstrategia {

	    @Override
	    public double algoritmo(double x, double y) {
	        return (y!=0)?x/y:0;
	    }
	    
	}



