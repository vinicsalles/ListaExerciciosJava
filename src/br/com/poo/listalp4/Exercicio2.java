package br.com.poo.listalp4;

import java.util.Scanner;

public class  Exercicio2 {
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Digite um ano: ");
			int num1 = s.nextInt();
			bissexto(num1);	
			s.close();
	}
	public static void bissexto(int num){
		if(num % 4 == 0) {
			System.out.println("Ele é um ano Bissexto");
		}else {
			System.out.println("Ele não é um ano Bissexto");
		}
	
	}
	
	
}
