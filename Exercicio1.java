package LaçosdeRepetiçao;

import java.util.Scanner;


public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1,n2;
		int x;
		
		System.out.println("Digite o Primeiro Número do intervalo: ");
		n1 = ler.nextInt();
		System.out.println("Digite o último Número do intervalo: ");
		n2 = ler.nextInt();
		
		if(n1>=n2) {
			System.out.println("Intervalo Inválido");
			}
	
	
		for(x=n1;x<=n2;x++) {
			
		if(x % 3==0 && x % 5 ==0) {
			System.out.println(x+" é múltiplo de 3 e/ou 5");
		} 
		}
		}
}

