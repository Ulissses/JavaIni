package gov.ba.fapesb.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome e: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome e: " + primeiroNome);
		
		System.out.println("Digite sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade e: " + idade);
		
		System.out.println("Digite sua altura:");
		double altura = scan.nextDouble();
		System.out.println("Sua altura e: " + altura);*/
		
		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem cachorro:");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		System.out.println("Voc� digitou os seguintes valores:");
		System.out.println("Primeiro Nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quandtidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem cachorro: " + temPet);
	}

}