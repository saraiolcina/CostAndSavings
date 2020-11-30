
public abstract class Dinero {
	
	protected double dinero;
	protected String description;
	
	public double getDinero() {		
		return dinero;
	}
	
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
	public  String getDescription() {		
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	/*Creamos la clase Dinero, en la cual:
	 * 
	 * 	* Hay dos variables protegidas (protected), ya que queremos que no sean visibles para nadie excepto para las clases que vayan a heredar de Dinero.
	 * 
	 * 	* Se crea un total de 4 métodos, los cuales nos van a servir para fijar la cantidad del dinero y la descripcion del mismo en esta clase Dinero.
	 * 		Así, más adelante, desde el constructor de las clases Ingreso y Gasto (ambas clases heredan de Dinero), utilizaremos estos métodos para asignar 
	 * 		el valor de los respectivos ingresos y gastos así como las descripciones, a través de las variables heredadas (dinero y description) de la clase 
	 * 		padre Dinero.
	 * */
}


