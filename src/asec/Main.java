package asec;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ska ta UPPER CASE eller lower case och konvertera det till motsatsen
		String i = "0";
		Scanner scan = new Scanner(System.in);
		int x = 0;
		System.out.println("Write a sentence:");
		String sentence = scan.nextLine();

		System.out
				.println("Press \"1\" to capitalise \nPress \"2\" to decapitalise");
		while (x != 1) {
			i = scan.nextLine();
			if (i.equals("1") || i.equals("2")) {
				x++;
			} else {
				System.out.println("Wrong input, try again");
			}
		}
		System.out.println(i);
		if (i.equals("1")) {
			sentence = sentence.toUpperCase();
			System.out.println(sentence);

		} else if (i.equals("2")) {
			sentence = sentence.toLowerCase();
			System.out.println(sentence);
			// efter "." ha en stor bokstav
			//if (. #).toUpperCase()
			
		} else {
			System.out.println("Something went wrong");
		}

		scan.close();

	}
}
