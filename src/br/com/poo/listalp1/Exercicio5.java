package br.com.poo.listalp1;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o primeiro número:  ");
		int num1 = s.nextInt();
		System.out.println("Digite o Segundo número:  ");
		int num2 = s.nextInt();
		if(num1 > num2) {
			System.out.println("O número " + num1 + " é maior que o " + num2);
		}else {
			System.out.println("O número " + num2 + " é maior que o " + num1);
		}
		s.close();
	}
}
