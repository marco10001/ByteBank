
public class FlujoConTratamiento {

	    public static void main(String[] args) {
	        System.out.println("Inicio del main");
	        metodo1();
	        System.out.println("Fin del main");
	    }

	    private static void metodo1() {
	        System.out.println("Inicio del metodo1");
	        metodo2();
	        System.out.println("Fin del metodo1");
	    }

	    private static void metodo2() {
	        System.out.println("Inicio del metodo2");
	        
	      MiException ae = new MiException("surgio un PROBLEMON");
	      throw ae;
	        
	    }

	}
