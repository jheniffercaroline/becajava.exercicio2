package exercicio2;

import java.util.*;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Qual e o seu salario registrado em sua carteira ? ");
		int valor = leitor.nextInt();

		System.out.println("Qual sera a porcentagem que sera acrescida em seu salario ?");
		int percentual = leitor.nextInt();

		int porcentagem = valor * percentual / 100;
		System.out.println("Seu salario tera um acrescimo de " + porcentagem + " reais.");

		int total = valor + porcentagem;
		System.out.println("seu salario atualizado sera " + total + " reais ");

	}
}