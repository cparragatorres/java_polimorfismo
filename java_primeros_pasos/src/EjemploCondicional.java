
public class EjemploCondicional {
	public static void main(String[] args) {
		System.out.println("Hello world");
		
		int edad = 17;
		int cantidad = 2;
		
		if (edad >= 18) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido");
		}
		else {
			if (cantidad >=2) {
				System.out.println("usted esta permitido a "
						+ "entrar");
			}
			else {
				System.out.println("Usted no esta permitido "
						+ "entrar");
			}
			
		}
			
		
	}
}