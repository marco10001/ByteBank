
public class CrearCuenta {
	public static void main(String[] args) {
		Cuenta primeraCuenta =	new Cuenta(12);
		//primeraCuenta.saldo=1000;
		//System.out.println(primeraCuenta);
		System.out.println(primeraCuenta);
		Cuenta segundaCuenta =new Cuenta(3);
		primeraCuenta=segundaCuenta;
		//System.out.println(segundaCuenta.titular);
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
	}
}
