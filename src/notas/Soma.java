package notas;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		
		for(int i=0; i < 5; i++) {
			System.out.println("NOta do " + (i+1) + "° aluno");
			soma = sc.nextInt();
		}
		
		System.out.println("Soma: " + soma);
		
		sc.close();
	}

}
