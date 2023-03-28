
public class EjemploContador2 {
	public static void main(String[] args) {
		int contador = 1;
		int acumulador=0;
		while (contador <= 10) {
			System.out.println(contador);
			acumulador=acumulador + contador;
			contador += 1;
			
		}
		System.out.println("la suma de los numeros del 1 al 10 es: "+acumulador);
	}

}
