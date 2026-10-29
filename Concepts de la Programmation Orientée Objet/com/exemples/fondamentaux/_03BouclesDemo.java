package com.exemples.fondamentaux;

public class _03BouclesDemo {

	public static void main(String[] args) {
		// Afficher le message "Boucle for"
		System.out.println("Boucle for");
		for (int i = 0; i < 5; i++) {
			System.out.println("i=" + i);// +i parce que avec i on va afficher la valeur de i
		}
		System.out.println("Boucle While");
		int j = 0;
		while (j < 5) {
			System.out.println("j=" + j);
			j++;
		}
		System.out.println("Boucle Do While");
		int k = 0;
		do {
			System.out.println("k= " + k);
			k++;
		} while (k < 5);
		System.out.println("Boucle for avec break");
		for (int i = 0; i < 5; i++) {
			System.out.println("i= " + i);
			if (i == 3) {
				break;
			}
		}
	}
}
