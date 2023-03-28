
public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario diego=new Gerente();
		diego.setDocumento(123213);
		diego.setNombre("Diego");
		diego.setSalario(500);
		diego.setTipo(0);
		
		Gerente marco =new Gerente();
		marco.setTipo(1);
		marco.setSalario(10000);
		
		System.out.println(marco.getBonificacion());
		System.out.println(diego.getBonificacion());
	}
}
