package Exercicio1;

import java.util.Random;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {		
		
		int[] num = new int[5]; //variável local
		preencher(num); //argumento do método --> variável que será enviada
		int maior = maiorValor(num);
		int menor = menorValor(num);
		System.out.println("Maior valor = " + maior);
		System.out.println("Menor valor = " + menor);

	}
	
	public static int menorValor(int[] num) {
		int aux = num[0];
		for(int i = 1; i < num.length; i++) {
			if(num[i] < aux) {
				aux = num[i];
			}
		}
		return aux;
	}
	
	public static int maiorValor(int[] num) {
		int aux = num[0];
		for(int i = 1; i < num.length; i++) {
			if(num[i] > aux) {
				aux = num[i];
			}
		}
		return aux;
	}
	
	public static void preencher(int[] num) { // num é um parâmetro do método --> o que vai receber
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < num.length; i++) {
			System.out.print("Valor: ");
			num[i] = teclado.nextInt();
		}
		teclado.close();
	}
	

}
