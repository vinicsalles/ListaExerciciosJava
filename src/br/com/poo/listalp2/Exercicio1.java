package br.com.poo.listalp2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite os valores para verificar se é um triangulo: \n");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		
		if(num1 + num2 + num3 == 180) {
			System.out.println("Ele é um triângulo");
		}else {
			System.out.println("Não é um triângulo");
		}
		s.close();
	}
}
