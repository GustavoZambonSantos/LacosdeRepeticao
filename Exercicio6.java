package LaçosdeRepetiçao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero;
		float soma=0, media=0,impar=0;
		
		do {
			System.out.println("Digite um numero: ");
			numero = ler.nextInt();
		if(numero % 3==0 && numero >0 )
		{impar++;
			soma +=numero;
			media = (soma/impar);
			
		}
		}while(numero !=0);
		
		
			System.out.println("A soma dos números foi de: "+soma);
			System.out.println("A média dos números foi de: "+media);
			
	}

}
