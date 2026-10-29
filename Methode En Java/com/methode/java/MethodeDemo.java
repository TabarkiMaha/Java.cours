package com.methode.java;

public class MethodeDemo {
	public static int addition(int a, int b) { // methode pour additionner deux entier ne depend pas de la classe
		return a + b;
	}

	public static void printMessage(String message) { // afficher un msg sans dependre d une instance de la classe
														// Utile pour afficher des msg ou des resultats de manieres
														// simple
		System.out.println(message);
	}

	public void displayMessage(String prefixe, String message) {
		System.out.println(prefixe + message);
	}

	public static void updateArray(int[] arr) {
		arr[0] = 100; // on veut que la valeur 0 devienne 100
		System.out.println(arr[0]);
	}

	public int calculateSomme(int a, int b) // methode d'instance a pour objectif: Calculer
	{
		return a + b;
	}

	public static void main(String[] args) {
		// Appel de la methode static addition (je mets le resultat dans une variable,
		// puisque c'est static je peux faire appel
		int result = addition(5, 10);
		System.out.println("Le resultat de l'addition est :" + result);
		// Appel à la methode printmessage
		printMessage("take it easy");
		int[] MyArray = { 1, 2, 3 };
		// Appel à la methode updateArray
		updateArray(MyArray);
		MethodeDemo demo = new MethodeDemo();
		int somme = demo.calculateSomme(5, 8);
		System.out.println(somme);
		demo.displayMessage("1" , " Maha");

	}

}
