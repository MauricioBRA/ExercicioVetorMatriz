package br.com.generation.vetor.matriz;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] vetor = new int [5];
 		int i, maior = 0;
		
		for(i = 0; i < 5; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = leia.nextInt();
			if(i == 0) {
				maior = vetor[0];
			}
			if(vetor[i] > maior) {
				maior = vetor[i];
			}
			System.out.println(" O maior número é: " + maior);
			leia.close();
		}
		

	}

}
