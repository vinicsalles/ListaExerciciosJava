package br.com.poo.listalp1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = s.nextLine();
		String sobrenome = s.nextLine();
		System.out.println("O nome completo é: " + nome + " " +sobrenome);
		s.close();

	}

}
