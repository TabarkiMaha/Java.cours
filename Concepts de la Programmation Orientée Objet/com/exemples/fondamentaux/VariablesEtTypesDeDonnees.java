package com.exemples.fondamentaux;

public class VariablesEtTypesDeDonnees {
	// variable globale, variable de classe
	static String globalMessage = "ceci est une variable globale";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Déclaration et initialisation des variables locales
		int age = 25; // Variable locale de type entier
		double pi = 3.14; // Variable locale de type double
		boolean isJavaFun = true; // Variable locale de type booléen
		boolean estSuperieur = age < 3;
		String message = "Java est génial !"; // Variable locale de type chaîne de caractères
		// Utilisation de la variable globale
		System.out.println(globalMessage);
		double result = age * pi; // Opération mathématique impliquant une conversion de type
		System.out.println(result);
		if (isJavaFun) {
			System.out.println("Java est amusant !");
		} else {
			System.out.println("Java n'est pas amusant.");
		}
		String newMessage = message + " je suis entrain d'apprendre ";
		System.out.println(newMessage);
		System.out.println(estSuperieur);

	}

}
