
public class TestFuncionario {
	
	public static void main(String[] args) {
		Funcionario diego = new Funcionario();
		diego.setNombre("Diego");
		diego.setSalario(2000);
		diego.setDni("12345678");
		diego.setTipo(0);
		
		System.out.println("salario: " + diego.getSalario());
		System.out.println("bonificacion: " + diego.getBonificacion());
	}
}
