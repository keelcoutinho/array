package Aula_03;

import java.util.Scanner;

public class Aula_Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] numeros = new int [2][3];
		int linha, coluna, quantPar = 0, somaImpar =0;
		Scanner leia = new Scanner(System.in);
		
		for (linha=0; linha<2; linha++) {
			for(coluna=0; coluna < 3; coluna++) {
				System.out.println("Linha "+linha +" na coluna "+ coluna);
				
				System.out.println("\n Entre com um n�mero: ");
				numeros[linha][coluna]= leia.nextInt();
				
				if(numeros[linha][coluna]%2 == 0) {
					quantPar++;
				}
				else {
					somaImpar += numeros[linha][coluna];
				}
			}
			
		}
		
		System.out.println("\n valores par: "+ quantPar);
		System.out.println("\n soma �mpar: "+ somaImpar);
		

		
	}

}
