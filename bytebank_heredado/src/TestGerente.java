
public class TestGerente {
	
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		// gerente.setSalario(5000);
		//Funcionario gerente = new Funcionario();
		gerente.setSalario(6000);
		gerente.setClave("AluraCursosOnline");
		gerente.setTipo(0);
		
		System.out.println("salario: " + gerente.getSalario());
		System.out.println("bonificacion: " + gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("AluraCursosOnline"));
	}
}
