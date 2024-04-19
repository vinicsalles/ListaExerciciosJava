package br.com.poo.listalp3;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = s.nextLine();
		String msg = gerarNome(nome);
		s.close();
		System.out.println(msg);
		
	}
	
	public static String gerarNome(String nome)	{
		return "Bom dia: " + nome;
	}
	
	
	
}
