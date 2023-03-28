
public class Cliente implements Autenticable {
	private String nombre;
	private String documento;
	private String sexo;
	
	private AutenticacionUtil util;
	
	private String clave;
	
	public Cliente() {
		this.util= new AutenticacionUtil();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDocumento() {
		return documento;
	}
	
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
	public void setClave(String clave) {
	this.clave=clave;
	}

	@Override
	public boolean iniciarSesion(String clave) {
		if(this.clave==clave) {
			return true;
		}
		return false;
	}



}
