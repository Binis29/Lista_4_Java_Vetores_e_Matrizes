/*
 * 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.

 */

package application;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double constante =0;
		int opcao, countSoma = 0, countDiferenca= 0, countConstante =0;
		final int LINHA = 2;
		final int COLUNA = 2;
		
		double [][] matrizUm = new double [LINHA][COLUNA];
		double [][] matrizDois = new double [LINHA][COLUNA];
		double [][] matrizSoma = new double [LINHA][COLUNA];
		double [][] matrizDiferenca = new double [LINHA][COLUNA];
		
		for(int i=0; i<LINHA; i++) {
			for(int j=0; j<COLUNA; j++){
				
				System.out.print("Entre com M1 [" + i + "][" + j + "]: ");
				matrizUm[i][j] = sc.nextDouble();	
			}
		}
		
		System.out.println();
		
		for(int i=0; i<LINHA; i++) {
			for(int j=0; j<COLUNA; j++){
				
			System.out.print("Entre com M2 [" + i + "][" + j + "]");
			matrizDois[i][j] = sc.nextDouble();
			}
		}
		
		System.out.println();
	
		do {
			
			
			System.out.println("Escolha uma opção:");
			System.out.println("1 - somar matrizes");
			System.out.println("2 - subtrair a primeira matriz da segunda ");
			System.out.println("3 - adicionar uma constante às duas matrizes");
			System.out.println("4 - imprimir as matrizes");
			System.out.println("5 - sair");
			
			opcao = sc.nextInt();
			
			if (opcao == 1) {
				
			
				for(int i=0; i<LINHA; i++) {
					for(int j=0; j<COLUNA; j++){
						
						matrizSoma[i][j] = matrizUm[i][j] + matrizDois[i][j];
						
						countSoma++;
					}
				}
			}
			
			if (opcao == 2) {
				
				for(int i=0; i<LINHA; i++) {
					for(int j=0; j<COLUNA; j++){
				
						matrizDiferenca[i][j] = matrizDois[i][j] - matrizUm[i][j];
						
						countDiferenca++;
					}
				}
			}
			
			if (opcao == 3) {
				
				System.out.println("Entre com o valor da constante: ");
				constante = sc.nextDouble();
				
				for(int i=0; i<LINHA; i++) {
					for(int j=0; j<COLUNA; j++){
						
						matrizUm[i][j] += constante;
						matrizDois[i][j] += constante; 
						
						countConstante++;
					}
				}
			}
			
			if(opcao == 4) {
				
				if(constante == 0) {
					System.out.println("Matriz Um: ");
					
					System.out.println();
					
					for(int i=0; i<LINHA; i++) {
						
						System.out.print("| ");
						
						for(int j=0; j<COLUNA; j++){
							
							System.out.print(  matrizUm[i][j] + " ");
							
						}
						System.out.print("| \n");
					}
					System.out.println();
					
					System.out.println("Matriz dois: ");
						
						System.out.println();
						
						for(int i=0; i<LINHA; i++) {
							
							System.out.print("| ");
							
							for(int j=0; j<COLUNA; j++){
								
								System.out.print(  matrizDois[i][j] + " ");
								
							}
							System.out.print("| \n");
						}
						
						System.out.println();
				} else {
					
					System.out.println("Matriz Um: ");
					
					System.out.println();
					
					for(int i=0; i<LINHA; i++) {
						
						System.out.print("| ");
						
						for(int j=0; j<COLUNA; j++){
							
							System.out.print( (matrizUm[i][j] - constante) + " ");
							
						}
						System.out.print("| \n");
					}
					System.out.println();
					
					System.out.println("Matriz dois: ");
						
						System.out.println();
						
						for(int i=0; i<LINHA; i++) {
							
							System.out.print("| ");
							
							for(int j=0; j<COLUNA; j++){
								
								System.out.print(  (matrizDois[i][j] - constante) + " ");
								
							}
							System.out.print("| \n");
						}
						
						System.out.println();
				}
				
				
				
				
				
				
				
				
				
				if (countSoma>0) {
					
					System.out.println("Matriz Soma: ");
						
						System.out.println();
						
						for(int i=0; i<LINHA; i++) {
							
							System.out.print("| ");
							
							for(int j=0; j<COLUNA; j++){
								
								System.out.print(  matrizSoma[i][j] + " ");
								
							}
							System.out.print("| \n");
						}
						
						System.out.println();
				}
				
				if (countDiferenca>0) {
					
					System.out.println("Matriz Diferença: ");
						
						System.out.println();
						
						for(int i=0; i<LINHA; i++) {
							
							System.out.print("| ");
							
							for(int j=0; j<COLUNA; j++){
								
								System.out.print(  matrizDiferenca[i][j] + " ");
								
							}
							System.out.print("| \n");
						}	
						
						System.out.println();
				}
				
				if (countConstante>0) {
					
					System.out.println("Matriz Um + contante: ");
						
						System.out.println();
						
						for(int i=0; i<LINHA; i++) {
							
							System.out.print("| ");
							
							for(int j=0; j<COLUNA; j++){
								
								System.out.print(  matrizUm[i][j] + " ");
								
							}
							System.out.print("| \n");
						}
						System.out.println();
						
						System.out.println("Matriz Dois + constante");
						
						System.out.println();
						
						for(int i=0; i<LINHA; i++) {
							
							System.out.print("| ");
							
							for(int j=0; j<COLUNA; j++){
								
								System.out.print(  matrizDois[i][j] + " ");
								
							}
							System.out.print("| \n");
						}	
						
						System.out.println();
				}
					
			}
			
		} while(opcao != 5 );
		
		System.out.println("fim!");
		
		sc.close();

	}

}
