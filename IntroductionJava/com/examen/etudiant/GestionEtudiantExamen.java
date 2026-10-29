package com.examen.etudiant;

public class GestionEtudiantExamen {

	public static void main(String[] args) {
		int notes[] = { 11, 9, 15, 7, 13, 10 };
		int somme = 0;
		int nombreReussies = 0;
		double moyenneNotes;
		for (int i = 0; i < notes.length; i++) {
			System.out.println(notes[i]);
			if (notes[i] >= 10) {
				System.out.println("Réussie");
				nombreReussies++;
				System.out.println(nombreReussies);
			} else {
				System.out.println("Échouée");
			}
			somme = somme + notes[i];
			System.out.println(somme);
		}
		moyenneNotes = (double) somme / notes.length; // pourquoi notes.length pas notes.length[i]
		System.out.println(moyenneNotes);
		if (moyenneNotes >= 10) {
			System.out.println("Étudiant admis");
		} else {
			System.out.println("Étudiant refusé");
		}
	}

}
