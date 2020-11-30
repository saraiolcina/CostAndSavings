
public class Usuario {
	
	private String nombre;	
	private int edad;	
	private String DNI;
	
	
	public Usuario() {	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
			this.edad = edad;		                                         		
	}

	public String getDNI() {
		return DNI;
	}

	
	
	public boolean setDNI(String DNI) {
		
		char [] dniarray = DNI.toCharArray();
		
		boolean comprueba=false; 
		int contador=0;
		
		if(DNI.length()>8 && DNI.length()<11) {	
			
				for(int i=0;i<8;i++) {
					if(Character.isDigit(dniarray[i])) {						
						contador++;
					}
					else {				
					comprueba=false;
					}			
				}	
				
				if(contador==8 && Character.isLetter(dniarray[8]) || Character.isLetter(dniarray[9])){
						comprueba=true;
					}				
				else {
						comprueba=false;
					}					
				}
		else {
			comprueba=false;
		}
		
		
		if(comprueba) {
			this.DNI=DNI;
		}
		else {
			System.out.println("Documento incorrecto, introduce un documento válido.");
		}
		return comprueba;
	}

	
	
	@Override
	public String toString() {
		return "Usuario: \n" +
				" Nombre: " + nombre + "\n"+
				" Edad:" + edad +  "\n"+
				" DNI=" + DNI;
	}
	
	
	/*
	 * El constructor de la clase Usuario no va a recibir ningún parámetro ni va a fijar los valores nombre, edad o DNI que se reciban por consola (se podrían incluir los métodos setter 
	 * dentro del constructor para que los fijara), pero en este caso hemos decicido que su función sea únicamente la de permitir crear instancias de la clase, y una vez esté
	 * creada la instancia, desde la clase prinicipal (Main) se vayan llamando a los respectivos setters de nombre, edad y dni para que se fijen los valores a través de la instancia.
	 * 
	 *  Creamos todos los setters y getters de la clase Usuario, lso cuales, una vez el usuario introduzca el valor por consola, se guardarán en las repestivas variables a través
	 *  de los métodos set, y los cuales serán devueltos por los métodos get.
	 *  Para el método set del DNI, hemos utilizado un formato que nos permite comprobar en primer lugar si el dni que introduce el usuario es válido o no.
	 *  Una vez se comprueba que el formato es válido, entonces la variable DNI que introduce el usuario queda asignada.
	 *  Función setDNI:
	 * 	Para facilitar el manejo de la comprobación, cambiamos el String "dni" que  recibe por parámetro y lo transformamos en array (usaremos funciones de tipo character).
	 * 	La variable local de tipo boolean "comprueba" es la que nos indicará si el dni es correcto o no. Está será la variable de control de la función, que también es de tipo
	 *  boolean. 
	 *  Si la función retorna que comprueba = true, entonces se asinga el valor del dni introducido por consola a la variable DNI, si no, lanza un mensaje de error.
	 * 	Primero revisamos el tamaño del array, debe ser mayor que 8 y menor que 11. Si esto se cumple, a través del for, revisamos que los 8 primeros caracteres de la variable
	 *  introducida sean dígitos, si esto también se cumple, entraríamos en un segundo if dentro del for, a través del cual comprobamos que la posición 9 o la posición 10 sea
	 *  una letra.
	 * 
	 *  Para generar el método toString(), directamente desde la clase, con el botón derecho le pedimos a Eclipse que lo genere en automático solo para las variables de clase, 
	 *  en este caso, nombre, edad y dni. 
	 * 
	 *  Las variables creadas son todas de tipo private, no queremos que sean visibles fuera de la clase. Como la clase Usuario no hereda ni es heredada de ninguna otra clase, esto
	 *  no nos afecta. 
	 *  En cambio, todos los métodos son de acceso public, pues veremos desde el main que se hace uso de ellos (se les llama) una vez se ha creado una instancia de la clase Usuario.
	 */

}
