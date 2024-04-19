package br.com.poo.listalp4;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(int i = 1; i < 5; i++) {
			System.out.print("Digite a nota 1 do aluno " + i + " : ");
			double nota1 = s.nextDouble();
			System.out.print("Digite a nota 2 do aluno " + i + " : ");
			double nota2 = s.nextDouble();
			double resultado = nota1 + nota2;
			System.out.println("A média das notas do aluno " + i + " é: "+ resultado / 2);
			s.close();
		}
	}
}
