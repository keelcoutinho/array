package Aula_03;

import java.util.Scanner;

public class Aula_Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[] media = new float[5];
		float n1, n2, n3, somaMedia = 0, mediaGeral;
		int x, contador =0;
		Scanner leia = new Scanner(System.in);
		
		
		for (x = 0; x < 5; x++) {
			System.out.println("\n Notas do aluno "+(x+1));
			System.out.println("\n Entre com a primeira nota: ");
			n1 = leia.nextFloat();
			while (n1 <0 || n1 >10) {
				System.out.println("\n Intervalo de notas errado.");
				n1 = leia.nextFloat();
			}
			
			System.out.println("\n Entre com a segunda nota: ");
			n2 = leia.nextFloat();
			while (n2 <0 || n2 >10) {
				System.out.println("\n Intervalo de notas errado.");
				n2 = leia.nextFloat();
			}
			
			System.out.println("\n Entre com a terceira nota: ");
			n3 = leia.nextFloat();
			while (n3 <0 || n3 >10) {
				System.out.println("\n Intervalo de notas errado.");
				n3 = leia.nextFloat();
			}
			
			
			media[x] = (n1+ n2+ n3)/ 3;
			
			System.out.print("\n Media: "+media[x]);
			
			if(media[x] >= 7 && media[x] <=10) {
				System.out.println("\n Aluno aprovado!");
				contador++;
			}
			else if(media[x] >=5  && media[x] <7) {
				System.out.println("\n Aluno de exame!");
			}
			else {
				System.out.println("\n Aluno reprovado!");
			}
			
			
			somaMedia += media[x]; 
			
		}
		
		mediaGeral = somaMedia / x;
		
		System.out.println("\n A média geral é: " + mediaGeral);
		
		System.err.println("\n Total alunos aprovados: " +contador);

		
	}

}
