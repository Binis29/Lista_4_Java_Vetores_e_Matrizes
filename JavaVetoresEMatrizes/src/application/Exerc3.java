
/*
 * 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */

package application;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
		
	final int LINHA = 3;
	
	final int COLUNA = 3;
	
	int numerosMaioresQueDez = 0;
		
	double [][]	matriz = new double [LINHA][COLUNA];
	
	for(int i=0; i<LINHA; i++) {
		
		for(int j=0; j<COLUNA; j++) {
			
			System.out.println("Entre com um valor qualquer: ");
			matriz[i][j] = sc.nextDouble();
		
			if(matriz[i][j] > 10) {
				
				numerosMaioresQueDez++;			}
		}	
	}
	
	System.out.println();
	
	System.out.printf("A matriz possui %d números maiores que 10!", numerosMaioresQueDez);
	
	sc.close();
	}
}
