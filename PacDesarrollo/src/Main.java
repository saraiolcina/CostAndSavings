import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// 1. Creación del usuario y sus datos, verificación del DNI introducido.
		
		Usuario usuario= new Usuario();
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce el nombre: ");
		String nombre = leer.nextLine();
		usuario.setNombre(nombre);
		System.out.println("Introduce la edad: ");
		int edad = leer.nextInt();
		if(edad<18||edad>99) {
			do {
				System.out.println("Edad incorrecta, por favor introduce una edad"
						+ " entre 18 y 99 años: ");
				edad = leer.nextInt();
			}
			while(edad<18||edad>99);
		}			
		usuario.setEdad(edad);
		System.out.println("Introduce el DNI: ");
		String dni=leer.nextLine();
		 do{
			dni=leer.nextLine();
		}
		 while(!usuario.setDNI(dni));		 
		 
		System.out.println("Usuario introducido correctamente.");	
		System.out.println();
				
		
		// 2. Creación de la cuenta.
		
		Cuenta cuentaUsuario = new Cuenta (usuario);
		
		
		
		// 3 y 4. Visualización del menú y operación de cada acción.		
	
		boolean salirAplicacion=false;
		double cantidad=33;
		String description="jj";
		
		while(!salirAplicacion) {
			System.out.println("Realiza una nueva acción: ");
			System.out.println("1 Introduce un nuevo gasto");
			System.out.println("2 Introduce un nuevo ingreso");
			System.out.println("3 Mostrar gastos");
			System.out.println("4 Mostrar ingresos");
			System.out.println("5 Mostrar saldo");
			System.out.println("0 Salir ");		
			int accion= leer.nextInt();
			
			switch(accion) {
			case 1:
				System.out.println("Has elegido la opción 1.");
				
				System.out.println("Introduce la descripción del gasto: ");	
				leer.nextLine();
				description=leer.nextLine();
				System.out.println("Introduce la cantidad: ");				
				cantidad=leer.nextDouble();				
				System.out.println("Saldo restante: " + cuentaUsuario.addGastos(description, cantidad));
				break;
			case 2:
				System.out.println("Has elegido la opción 2.");
				System.out.println("Introduce la descripción del ingreso: ");
				leer.nextLine();
				description=leer.nextLine();
				System.out.println("Introduce la cantidad: ");
				cantidad=leer.nextDouble();
				System.out.println("Saldo restante: " +cuentaUsuario.addIngresos(description, cantidad));
				break;
			case 3:
				System.out.println("Has elegido la opción 3.");
				cuentaUsuario.getGastos();
				break;
			case 4:
				System.out.println("Has elegido la opción 4.");
				cuentaUsuario.getIngresos();				
				break;
			case 5:
				System.out.println("Has elegido la opción 5.");
				System.out.println(cuentaUsuario);
				break;
			case 0:
				System.out.println("Has elegido salir de la aplicación.");
				salirAplicacion=true;
				break;
			default:
				System.out.println("Selecciona una opción válida");
			}
		}
		
		
		// 5. Finalizar la aplicación. 
		
		System.out.println("Fin del programa.");
		System.out.println("Gracias por utilizar la aplicación.");
		
		
		
		
		
		
		
		
		
		/* Lo primero que hacemos es crear un usuario a través de uns instancia de Usuario, indicando su nombre, edad y DNI.
		 * Tanto para la edad como para el DNI, vamos a especificar unos requisitos previos de aceptación.
		 * Mientras la edad introducida sea menor a 18 o mayor a 99, queremos que el programa lea de forma continua los datos.
		 * Lo mismo ocurre para el DNI, hasta que la función setDNI no devuelva un valor true, queremos que se siga preguntando al usuario
		 * para seguir leyéndola por consola y verificandola según los requisitos de la función.
		 * 
		 * A continuación creamos la cuenta y pasamos a visualizar el menú de opciones.
		 * Para éste hemos utilizado un bucle switch del cual se sale únicamente cuando la variable salirAplicación se vuelve true, 
		 * que ocurre cuando el usuario selecciona la opción 0 del menú (opción salir).
		 * 
		 * Para cada opción hay una operación distinta.
		 * Las opciones de introducir ingresos y gastos van a usar las funciones de addGastos y addIngresos de la clase Cuenta, por lo que
		 * usaremos la cuenta previamente creada para llamar a dichas funciones.
		 * Estas funciones requieren que se les pase por parámetro tanto la descripción como la cantidad del ingreso/gasto a realizar, por lo que
		 * para cada gasto o ingreso, se realizará la pregunta al usuario.
		 * 
		 * Estas variables, serán almacenadas en las listas "ingresos" y "gastos" a través de las funciones addIngresos y addGastos, con lo que
		 * si el usuario selecciona la opción 3 o 4, simplemente llamamos a las funciones que retornan dichas listas para ver un listado de los 
		 * movimientos realizados. 
		 */
		
		/*BIBLIOGRAFÍA:
		 * 
		 * >> Material didáctico asignatura. Temas 7,8,9 y 10.
		 * >> https://docs.oracle.com/javase/7/docs/api/
		 * >> https://www.discoduroderoer.es/
		 * >> https://www.w3schools.com/java/
		 * >> https://stackoverflow.com/
		 *  
		 */
		
		
		
		
		
		
		
		
		
		

	}

}
