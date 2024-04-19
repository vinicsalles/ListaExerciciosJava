package br.com.poo.listalp2;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num1 = s.nextInt();
		for(int i = 1; i <= num1; i++) {
			System.out.println(i);
		}
		
		
		
		s.close();
	}
	
}
