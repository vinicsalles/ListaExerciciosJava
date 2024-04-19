package br.com.poo.listalp3;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num1 = s.nextInt();
		for (int i = 1; i <= num1; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("\n");
		}
		s.close();
	}
}
