package suma;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		suma();
	}

	public static void suma() {
		int a,b, resultado;
		String respuesta="s";
		
		Scanner teclado =new Scanner(System.in);
		while (respuesta=="s"){
			System.out.println("Introduce un n�mero positivo:");
			a=teclado.nextInt();
			System.out.println("Introduce otro n�mero positivo:");
			b=teclado.nextInt();
			if ((a > 0) && (b >0)) {
				resultado= a+b;
				System.out.println("El resultado es " + resultado);
				
			}
			else {
				System.out.println("No son positivos");
			}
			System.out.println("�Quieres seguir sumando? s/n");
			respuesta=teclado.next();
		}
		teclado.close();
		
		
	}
}
