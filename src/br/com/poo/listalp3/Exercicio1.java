package br.com.poo.listalp3;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num1 = s.nextInt();
		int soma = 0;
		for (int i = 1; i <= num1; i++) {
			soma = soma + i;
			System.out.println(i);	
		}
		System.out.println("A soma dos números é: "+ soma);

		s.close();
	}
}
