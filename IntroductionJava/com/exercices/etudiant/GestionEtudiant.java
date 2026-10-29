package com.exercices.etudiant;

public class GestionEtudiant {
	static String nomEcole = "Université";
	static String pays = "Belgique";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom = "Ali";
		int note = 12;
		int age = 20;
		double moyenne = 13.5;
		boolean estBoursier = false;
		boolean estPresent = true;
		int[] notes = { 10, 15, 8, 12, 14 };
		int somme = 0;
		int nombreValidees = 0;
		int niveau = 2;
		System.out.println(nomEcole);
		if (estPresent) {
			System.out.println("L'étudiant est présent");
		} else {
			System.out.println("L'étudiant est absent");
		}
		if (note >= 10) {
			System.out.println("Admis");
		} else {
			System.out.println("Refusé");
		}
		String messageFinal = "Nom : " + nom + ", Note : " + note;
		System.out.println(messageFinal);
		System.out.println(nomEcole);
		System.out.println(pays);
		if (moyenne >= 16) {
			System.out.println("Excellent");
		} else if (moyenne >= 12) {
			System.out.println("Bien");
		} else if (moyenne >= 10) {
			System.out.println("Passable");
		} else
			System.out.println("Echec");
		if (age >= 18) {
			System.out.println("Majeur");
		} else {
			System.out.println("Mineur");
		}
		if (estBoursier) {
			System.out.println("Etudiant boursier");
		} else
			System.out.println("Non boursier");
		String resume = "Nom : " + nom + ", Moyenne : " + moyenne + ", Age : " + age;
		System.out.println(resume);
		for (int i = 0; i < 5; i++) {
			System.out.println(notes[i]);
			if (notes[i] >= 10) {
				System.out.println("Validée");
			} else {
				System.out.println("Non Validée");
			}
			somme = somme + notes[i];
			if (notes[i] >= 10) {
				nombreValidees = nombreValidees + 1;
			} else {
				nombreValidees = nombreValidees + 0;
			}
			System.out.println(nombreValidees);
		}
		System.out.println(somme);
		double moyenneNotes;
		moyenneNotes = (double) somme / notes.length;
		System.out.println(moyenneNotes);
		if (moyenneNotes >= 10) {
			System.out.println("Étudiant validé");
		} else {
			System.out.println("Étudiant non validé");
		}
		int j = 0;
		while (j < notes.length) {
			System.out.println(notes[j]);
			j++;
		}
		switch (niveau) {
		case 1:
			System.out.println("Débutant");
			break;
		case 2:
			System.out.println("Intermédiaire");
			break;
		case 3:
			System.out.println("Avancé");
			break;
		default:
			System.out.println("Niveau inconnu");
			break;
		}
	}
}
