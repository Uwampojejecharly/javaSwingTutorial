package fr.charly.javaSwingTutorial;

public class Main {

	public static void main(String[] args) {

		String pseudo = "Charly";
		int age = 17;
		
		System.out.println(pseudo + " " +age);
		age++;
		System.out.println("le pseudo change");
		pseudo = "ben";
		System.out.println(pseudo + " " +age);
		
		int note1 = 20;
		int note2 = 0;
		int note3 = 0;
		
		int calcul = (note1 + note2 + note3) / 3;
		System.out.println(calcul);

	}

}
