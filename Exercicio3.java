package LaçosdeRepetiçao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero, menores=0, maiores=0;
		
		System.out.println("\nEntre com um numero: ");
		numero = ler.nextInt();
		
		while(numero >0) {
			
			if(numero <21) {
				menores++;
			}else if (numero >50)
			{
				maiores++;;
			}else {
				System.out.println("\nOpção Invalida");
			}
			
			System.out.println("\nEntre com um numero: ");
			numero = ler.nextInt();
		
			
		}
		System.out.println("\nTotal de pesosas menores de 21 anos: "+menores);
		System.out.println("\nTotal de pesosas maiores de 50 anos: "+maiores);
	}
	
	
	

}
