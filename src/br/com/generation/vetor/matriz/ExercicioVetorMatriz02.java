package br.com.generation.vetor.matriz;

import java.util.Random;
//Sorteio Lotof�cil....!!!!

public class ExercicioVetorMatriz02 {

	public static void main(String[] args) throws InterruptedException {
		
		Random randomGeneration = new Random();
        int[] dice = new int[25];
        int maior=0, quantponto=0, result;//soma=0,
        double media= 0.0, soma = 0.0;

        
        System.out.println("� HORA DOS DADOS BABY!!!");
        for(int i = 0; i < 15; i++) {
            result = randomGeneration.nextInt(1, 25);
            System.out.println((i+1) + "� Arremesso: " + result);
            Thread.sleep(500);
            dice[i] = result;
            soma = soma + result;
            media = soma / 15;
            if(maior < result) {
                maior = result;
            }
        }
        for(int i = 0; i < 15; i++) {
            if(dice[i] == maior) {
                quantponto++;
            }
        }
        System.out.println();
        System.out.println("======RESULTADOS======");
        System.out.print("A soma dos resultados �: " + soma);
        System.out.println();
        System.out.print("O maior valor �: " + maior);
        System.out.println();
        System.out.print("A quantidade da maior pontua��o �: " + quantponto);
        System.out.println();
        System.out.print("A m�dia dos valores s�o: " + media);
    }
}