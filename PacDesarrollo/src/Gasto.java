
public class Gasto extends Dinero{

	public Gasto(double gasto, String description) {		
		super();		
		super.setDinero(gasto);			
		super.setDescription(description);
	}

	
	@Override
	public String toString() {
		return "Gasto: " + description + ", cantidad:" + dinero +"€";
	}		
	
	/*
	 * Las clases Gasto e Ingreso, ambas heredan de la clase padre Dinero.
	 * Tanto el constructor de Ingreso como el de Gasto, reciben dos parámetros que son los que vamos a utilizar
	 * para "fijar" (inicializar) el valor de las variables de la clase padre Dinero (dinero y description).
	 * De esta forma, el valor de la variable de la clase padre "dinero" en la clase hija Gasto, será igual al parámetro "gasto" 
	 * que el constructor de la clase hija Gasto está recibiendo, así como la descripción.
	 * A través de la indicación "super." llamamos a los métodos de la clase padre.
	 * Lo mismo ocurre con la clase hija Ingreso.
	 * 
	 * Es decir, vamos a usar estas clases para "crear" un gasto o un ingreso desde el main, y para crear ese gasto o ese 
	 * ingreso, será necesario que el usuario introduzca tanto la cantidad a gastar/ingresar como la descripción de dicho
	 * gasto/ingreso cada vez que quiera realizar una nueva acción de este tipo.
	 * 
	 * Los métodos toString() han sido generados directamente desde las variables del método padre, por eso aparece 
	 * la etiqueta "@Override". 
	 */
}
