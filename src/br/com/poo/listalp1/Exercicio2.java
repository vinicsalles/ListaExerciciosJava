package br.com.poo.listalp1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num1 = s.nextInt();
		System.out.println("Digite outro número: ");
		int num2 = s.nextInt();
		System.out.println("A soma dos numeros é: " + (num1 + num2));
		System.out.println("A subtração dos numeros é: " + (num1 - num2));
		System.out.println("A multiplicação dos numeros é: " + (num1 * num2));
		System.out.println("A Divisão dos numeros é: " + (num1 / num2));
		s.close();

	}

}
