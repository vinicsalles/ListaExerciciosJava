package br.com.poo.listalp2;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char vogal = s.next().toLowerCase().charAt(0);
		if(vogal == 'a' || vogal == 'e' || vogal == 'i' || vogal == 'o' || vogal == 'u') {
			System.out.println("É uma Vogal ");
		}else {
			System.out.println("Não é uma vogal");
		}
		s.close();
	}
}
