
public class TestConexion {
	public static void main(String[] args) throws Exception {
	
		
		
		try (Conexion con=new Conexion();){
			con.leerDatos();
			
		}catch (IllegalStateException ex) {
			ex.printStackTrace();
		}finally {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
