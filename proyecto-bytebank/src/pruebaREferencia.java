
public class pruebaREferencia {
	public static void main(String[] args) {
		Cliente marco=new Cliente();
		marco.setDocumento("43369370");
		marco.setNombre("Marco");
		marco.setSexo("Masculino");
		
		Cuenta cuentaDeMarco=new Cuenta(444);
		cuentaDeMarco.setTitular(marco);
		
		System.out.println(cuentaDeMarco.getTitular().getSexo());
		System.out.println(cuentaDeMarco.getTitular());
	}
}
