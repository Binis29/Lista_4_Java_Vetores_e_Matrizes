/*
 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.

 */

package application;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int inteiros = 6;
		int somaDosNumerosPares=0, contadorDosNumerosImpares=0;
		
		int [] vetorDeInteiros = new int [inteiros];
		
		for(int i=0; i<vetorDeInteiros.length; i++) {
			
			System.out.println("Digite um n�mero inteiro positivo: ");
			vetorDeInteiros[i] = sc.nextInt();
			
			if(vetorDeInteiros[i] % 2 ==0) {
				
				somaDosNumerosPares += vetorDeInteiros[i];
				
			} else {
				
				contadorDosNumerosImpares++;
			}
				
		}	
		
		System.out.println("N�meros pares digitados: ");
		
		for(int j=0; j<vetorDeInteiros.length; j++) {
				
			if (vetorDeInteiros[j] % 2 ==0) {
					
				System.out.println(vetorDeInteiros[j]);
				
			} 
		}
		
		System.out.println("Soma dos n�meros pares digitados: " + somaDosNumerosPares);
		
		System.out.println();
		
		System.out.println("N�meros �mpares digitados: ");
		
		for(int j=0; j<vetorDeInteiros.length; j++) {
				
			if (vetorDeInteiros[j] % 2 == 1) {
					
				System.out.println(vetorDeInteiros[j]);
				
			} 
		}
		
		System.out.println("Quantidade de n�meros �mpares digitados: " + contadorDosNumerosImpares);
		
		sc.close();
	}

}
