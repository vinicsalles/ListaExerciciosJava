package br.com.poo.listalp3;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num1 = s.nextInt();
		System.out.print("Digite outro número: ");
		int num2 = s.nextInt();
		System.out.print("Digite um operador: (+ - * /) ");
		String op = s.next();
		if (op.equals("+")) {
			System.out.println("A soma do " + num1 + " + " + num2 + " é igual a: " + soma(num1, num2));
		} else if (op.equals("-")) {
			System.out.println("A subtração do " + num1 + " - " + num2 + " é igual a: " + sub(num1, num2));
		} else if (op.equals("*")) {
			System.out.println("A Multiplicação do " + num1 + " * " + num2 + " é igual a: " + mult(num1, num2));
		} else if (op.equals("/")) {
			System.out.println("A Divisão do " + num1 + " / " + num2 + " é igual a: " + div(num1, num2));
		} else {
			System.out.println("Operador Inválido");
		}

		System.out.println("");
		s.close();
	}

	public static int soma(int num1, int num2) {
		return num1 + num2;
	}

	public static int sub(int num1, int num2) {
		return num1 - num2;
	}

	public static int mult(int num1, int num2) {
		return num1 * num2;
	}

	public static double div(int num1, int num2) {
		return num1 / num2;
	}

}
