package br.com.poo.listalp2;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Insira um número: ");
		int num1 = s.nextInt();
		System.out.print("Insira outro número: ");
		int num2 = s.nextInt();
		System.out.print("Insira um operador: ");
		char op = s.next().toLowerCase().charAt(0);
		if(op == '+') {
			System.out.println("O Resultado da soma é: "+ (num1 + num2));
		}
		else if(op == '-'){
			System.out.println("O Resultado da subtração é: "+ (num1 - num2));
		}
		else if(op == '*'){
			System.out.println("O Resultado da multiplicação é: "+ (num1 * num2));
		}
		else if(op == '/') {
			System.out.println("O Resultado da Divisão é: "+ ((float)num1 / num2));
		}
		
		else {
			System.out.println("Operador Inválido");
		}
		s.close();
	}
}
