package notas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> lista = new ArrayList<>();

		int soma = 0;
		int menoresQueSeis = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Nota do " + (i + 1) + "° aluno");
			int nota = sc.nextInt();
			soma += nota;
			lista.add(nota);

			if (nota < 6) {
				menoresQueSeis++;
			}

		}

		int maior = lista.get(0);
		int menor = lista.get(0);

		for (int i = 0; i < lista.size(); i++) {

			if (menor > lista.get(i)) {
				menor = lista.get(i);
			}
			if (maior < lista.get(i)) {
				maior = lista.get(i);
			}

		}

		double media = (double) soma / 5;

		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		System.out.println("Notas menores que 6: " + menoresQueSeis);
		System.out.println("Menor nota: " + menor);
		System.out.println("Maior nota: " + maior);

		sc.close();
	}

}
