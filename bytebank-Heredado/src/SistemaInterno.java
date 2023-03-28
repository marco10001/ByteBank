
public class SistemaInterno {

	private String clave="12345";
	
	public boolean Autentica(Autenticable gerente) {
		boolean puedeIniciarSerion=gerente.iniciarSesion(clave);
		if(puedeIniciarSerion) {
			System.out.println("Login exitoso");
			return true;
		}else {
			System.out.println("Error de Login");
			return false;
		}
		
		
	}
	
}
