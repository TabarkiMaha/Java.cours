package com.examen.exercicefinal;

public class AnalyseNotes {

	public static void main(String[] args) {
		int[] notes = { 14, 8, 17, 10, 5, 13, 19 };
		int somme = 0;
		int nombreReussies = 0;
		int max = notes[0];
		int min = notes[0];
		double moyenne;
		for (int i = 0; i < notes.length; i++) {
			System.out.println(notes[i]);
			if (notes[i] >= 10) {
				System.out.println("Réussie");
				nombreReussies++;
			} else {
				System.out.println("Échouée");
			}
			somme += notes[i];
			if (notes[i] > max) {
				max = notes[i];
			}
			if (notes[i] < min) {
				min = notes[i];
			}
		}
			moyenne = (double)somme / notes.length;
			if (moyenne >= 12) {
				System.out.println("Bon niveau");
			} else {
				System.out.println("Niveau à améliorer");
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(somme);
		System.out.println(nombreReussies);
	}

}
