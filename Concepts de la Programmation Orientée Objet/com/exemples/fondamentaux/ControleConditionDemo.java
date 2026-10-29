package com.exemples.fondamentaux;

public class ControleConditionDemo {

	public static void main(String[] args) {
		int nombre = 15;
		if (nombre <= 20) {
			System.out.println("le nombre est supérieur à 10");
		} else {
			System.out.println("Le nombre est inférieur à 10");
		}
		switch (nombre) {
		case 10:
			System.out.println("Le nombre est 10");
			break;
		case 15:
			System.out.println("Le nombre est 15");
			break;
		default:
			System.out.println("Nombre inconnu");
			break;
		}
	}

}
