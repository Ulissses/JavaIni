package gov.ba.fapesb.cursojava.aula18;

public class Exercicio13 {

	public static void main(String[] args) {
		// A soma de todos os elementos de A multiplos de 5
		
		int soma = 0;
		int[] arrayA = new int[10];
		arrayA[0] = 1;
		arrayA[1] = 2;
		arrayA[2] = 3;
		arrayA[3] = 4;
		arrayA[4] = 5;
		arrayA[5] = 6;
		arrayA[6] = 7;
		arrayA[7] = 8;
		arrayA[8] = 9;
		arrayA[9] = 10;
		
		System.out.println("A soma de todos os elementos de A multiplos de 5");
		for (int i = 0; i < arrayA.length; i++){
			if (arrayA[i] % 5 == 0){
			soma += arrayA[i];
			}
		}
		System.out.println("Total da soma " + soma);
	}

}
