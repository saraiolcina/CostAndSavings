import java.util.ArrayList;

public class Cuenta {
	
	private double saldo;	
	private Usuario usuario;
	
	private ArrayList <Gasto> gastos = new ArrayList <Gasto>();	
	private ArrayList <Ingreso> ingresos = new ArrayList <Ingreso>();
	
	
	public Cuenta(Usuario usuario) {		
		this.usuario=usuario;
		this.saldo=0;		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	public double addIngresos (String description, double cantidad) {
		
		Ingreso i = new Ingreso(cantidad, description);		
		if(cantidad>0) {			
			saldo = saldo + cantidad;
		}		
		ingresos.add(i);		
		return saldo;
	}
	
	
	public double addGastos (String description, double cantidad) {
		
		Gasto g = new Gasto(cantidad, description);		
			try {
				if (cantidad>saldo) {	
					throw new GastoException();
				}
				else {
					gastos.add(g);				
					saldo= saldo-cantidad;
				}
			}catch (GastoException error) {					
			}				
		return saldo;		
	}
	
	

	public ArrayList<Gasto> getGastos() {
		
		for(int i=0;i<gastos.size();i++) 
			System.out.println(gastos.get(i));
		
		return gastos;
	}

	public ArrayList<Ingreso> getIngresos() {	
		
		for(int i=0;i<ingresos.size();i++) 
			System.out.println(ingresos.get(i));
		
		return ingresos;
	}

	@Override
	public String toString() {
		return usuario + "\n"
				+ "Saldo actual de la cuenta: " + saldo;
	}
	
	
	
	
	
	/* Las variables definidas son todas de tipo private, pues no queremos que sean visibles fuera de la clase. Los métodos en cambio son públicos para
	 * poder acceder a ellos desde el main.
	 * Se ha creado la variable "usuario" de tipo Usuario, así como las listas "ingresos" y "gastos" de tipo Ingreso y Gasto respectivamente.
	 * Hemos creado listas (y no arrays) pues no sabemos de antemano qué cantidad de ingresos o gastos va a realizar el usuario, iremos añadiéndolas según el 
	 * usuario las vaya realizando.
	 * 
	 * El constructor de Cuenta recibe como parámetro de entrada una variable de tipo Usuario.
	 * Cuando desde el main queramos crear una instancia de cuenta, llamaremos a su constructor, el cuál recibirá por parámetro al usuario previamente creado.
	 * Dentro del constructor inicializamos el saldo de la cuenta en 0, y además, vinculamos el usuario recibido por parámetro (que es una instancia de la clase Usuario
	 * que ya ha sido creada previamente) con la variable usuario de tipo Usuario que queremos utilizar en la clase Cuenta. 
	 * 
	 * Los métodos getters y setters de saldo y usuario, nos servirán para determinar en cada momento el saldo y usuario sobre el que estamos trabajando.
	 * 
	 * Las funciones addIngresos y addGastos se encargan de actualizar el saldo de la cuenta.
	 * Ambas funcionan del mismo modo:
	 * Una vez se ha creado desde el main una instancia de la cuenta, se llama a cualquiera de estas funciones, las cuales reciben por parámetro tanto la descripción del
	 * gasto/ingreso como la cantidad del mismo.
	 * Lo primero que se hace al entrar en la función es crear una nueva instancia de Ingreso o Gasto, a las cuales también se les pasa como parámetro 
	 * (así lo requieren sus constructores) una descripción y un gasto de la cantidad. Es edcir, dentro de la función addGastos o addIngresos vamos a crear una instancia de
	 * Gasto o Ingreso con los datos que recibimos.
	 * A continuación, para cada función, realizamos una u otra operación (suma o resta del saldo de la cuenta) y por último, si se cumplen las condiciones de
	 * verificación que requieren estas operaciones, se añade la instancia de Ingreso o Gasto que hemos creado al inicio al respectivo ArrayList de Ingreso o Gasto, para 
	 * que se vayan almacenando en las listas "ingresos" o "gastos".
	 * La función addGastos tiene la particularidad de contener en su cuerpo una excepción. Pues queremos que si el cliente introduce un gasto para el cuál no tiene
	 * suficiente saldo, la aplicación no le permita retirar dicha cantidad de dinero y le lanza un mensaje explicativo.
	 * Además, queremos que, si se diera ese escenario, la aplicación siga funcionando, no que se corte su ejecución, motivo por el cual, creamos aparte la clase 
	 * GastoException (que hereda de Exception), en la que viene definido ese mensaje explicativo.
	 * 
	 * Por último, se crean los métodos getGastos y getIngresos, los cuales retornan las listas con las instancias de tipo Ingresos o Gastos que se hayan añadido hasta
	 * el momento. 
	 * 
	 * Vemos que la clase Cuenta no hereda ni es heredada de ninguna clase pero va a utilizar métodos de prácticamente todas las clases.
	 * 
	 * */

}
