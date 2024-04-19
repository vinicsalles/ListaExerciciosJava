package br.com.poo.listalp2;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num1 = s.nextInt();
		String resultado = String.valueOf(num1);
		System.out.println(resultado.length());
		s.close();
	}
}
