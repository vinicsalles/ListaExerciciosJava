package br.com.poo.listalp1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite os graus em Celsius: ");
		int num1 = s.nextInt();
		float somaFaren = (num1 * 9/5) + 32;
		System.out.println("A conversão para Farenheit é: " + somaFaren);
		s.close();
	}
}
