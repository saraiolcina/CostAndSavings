
public class Ingreso extends Dinero{
	
	public Ingreso(double ingreso, String description) {		
		super();		
		super.setDinero(ingreso);		
		super.setDescription(description);			
	}

	@Override
	public String toString() {
		return "Ingreso: " + description + ", cantidad:" + dinero + "€";
	}
	
}
