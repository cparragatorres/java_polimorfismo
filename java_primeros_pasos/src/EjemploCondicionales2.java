
public class EjemploCondicionales2 {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad >=18 && esPareja;
		
		if(puedeEntrar) {
			System.out.println("Sea bienvenido");
		}else {
			System.out.println("Usted no puede entrar");
		}
	}
}
