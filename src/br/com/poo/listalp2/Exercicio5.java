package br.com.poo.listalp2;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Sexo: ");
		String sexo = s.next().toLowerCase();
		System.out.println("Idade: ");
		int idade = s.nextInt();
		System.out.println("Condição Especial? (sim) ou (não)");
		String condicao = s.next().toLowerCase();
		
		if(idade >= 60 || condicao.equals("sim")  || sexo.equals("feminino")  && condicao.equals("gestante")){
			System.out.println("Fila Preferêncial");
		}else {
			System.out.println("Fila Normal");
		}
		s.close();
	}
}
