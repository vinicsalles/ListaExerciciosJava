package br.com.poo.listalp4;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Digite um número: ");
		double num1 = s.nextInt();
		System.out.print("Digite outro  número: ");
		double num2 = s.nextInt();
		System.out.println("A média é: " + (num1 + num2)/2 );
		s.close();
		
	}
}
