package notas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		List<Integer> lista = new ArrayList<>();
		int menoresQueSeis = 0;
		
		for(int i=0; i < 5; i++) {
			System.out.println("NOta do " + (i+1) + "° aluno");
			int nota = sc.nextInt();
			soma += nota;
			lista.add(nota);
			
			if (nota < 6 ) {
				menoresQueSeis++;
			}
		}
		
		double media = (double) soma / 5;
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		System.out.println("Notas menores que 6: " + menoresQueSeis);
		
		sc.close();
	}

}
