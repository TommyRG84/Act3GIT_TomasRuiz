package Act3GIT;

import java.util.Scanner;

public class IntervaloNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inroduzca dos valores y el programa imprimirá el intervalo entre ellos.");
		System.out.println("Introduzca el número más bajo");
		int numeroBajo = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca el número más alto");
		int numeroAlto = Integer.parseInt(sc.nextLine());
		
		for (int i = numeroBajo; i < numeroAlto; i+=7) {
			System.out.println(i);
		}

	}

}
