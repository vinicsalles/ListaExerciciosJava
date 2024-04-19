package br.com.poo.listalp3;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num1 = s.nextInt();
		for (int i = num1; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		s.close();
	}

}
