package br.com.poo.listalp1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um número de horas trabalhadas: ");
		int num1 = s.nextInt();
		System.out.println("Digite o numero de horas extras ");
		int num2 = s.nextInt();
		int soma = num1 * 10;
		int soma2 = num2 * 15;
		System.out.println("Seu salário anual é:  " + (soma + soma2));
		s.close();
	}
}
