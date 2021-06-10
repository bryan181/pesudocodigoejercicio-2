import java.util.*;

public class ejercicio2 {

	public static void main(String args[]) {
		int cont;
		int n;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese un numero: ");
		n = scanner.nextInt();
		cont = 0;
		
		for (cont=1;cont<=n-1;cont++) {
			System.out.println("Los números comprendidos entre "+n+" y 1 "+"son: "+cont);
		}
		System.out.println("Números totales comprendidos: "+(n-1)+".");
	}
}
