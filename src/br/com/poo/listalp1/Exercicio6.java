package br.com.poo.listalp1;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o primeiro número:  ");
		int num1 = s.nextInt();
		if(num1 % 10 == 0) {
			System.out.println("O número " + num1 + " é par.");
		}else {
			System.out.println("O número " + num1 + " é ímpar.");
		}
		s.close();
	}
}
