package br.com.poo.listalp3;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num1 = s.nextInt();
		for (int i = 1; i <= 10; i++) {
			int soma = num1 * i;
			System.out.println(num1 + " * " + i + " = " + soma);
		}
		s.close();
	}
}
