package LaçosdeRepetiçao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero, pares = 0, impar = 0, x;
		
		for(x=1;x<=10;x++) {
		System.out.println("digite o número: ");
		numero=ler.nextInt();

		if(numero %2==0) {
			pares = pares +1;
		}
		else {
			impar = impar +1;
		}
		}
		System.out.println("total de números pares: "+pares);
		System.out.println("total de números impares: "+impar);
		
	}
}

	