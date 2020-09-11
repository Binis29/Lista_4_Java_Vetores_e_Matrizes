/*
 * 2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.

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
			
			System.out.println("Digite um número inteiro positivo: ");
			vetorDeInteiros[i] = sc.nextInt();
			
			if(vetorDeInteiros[i] % 2 ==0) {
				
				somaDosNumerosPares += vetorDeInteiros[i];
				
			} else {
				
				contadorDosNumerosImpares++;
			}
				
		}	
		
		System.out.println("Números pares digitados: ");
		
		for(int j=0; j<vetorDeInteiros.length; j++) {
				
			if (vetorDeInteiros[j] % 2 ==0) {
					
				System.out.println(vetorDeInteiros[j]);
				
			} 
		}
		
		System.out.println("Soma dos números pares digitados: " + somaDosNumerosPares);
		
		System.out.println();
		
		System.out.println("Números ímpares digitados: ");
		
		for(int j=0; j<vetorDeInteiros.length; j++) {
				
			if (vetorDeInteiros[j] % 2 == 1) {
					
				System.out.println(vetorDeInteiros[j]);
				
			} 
		}
		
		System.out.println("Quantidade de números ímpares digitados: " + contadorDosNumerosImpares);
		
		sc.close();
	}

}
