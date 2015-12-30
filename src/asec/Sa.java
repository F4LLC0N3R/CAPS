package asec;

import java.util.Scanner;

public class Sa {
	public static void main(String[] args) {

		String blah;
		Scanner scan = new Scanner(System.in);

		System.out.println("type");
		blah = scan.next();
		for (int i = 0; i < 10; i++) {
			if (blah.equals("2") || blah.equals("1"))
				System.out.println("yahy");
			System.out.println(blah);
		}
	}

}

/*
 * import java.util.Scanner;
 * 
 * public class Sa {
 * 
 * public static void main(String[] args) { // ska ta UPPER CASE eller lower
 * case och konvertera det till motsatsen int i = 0; Scanner scan = new
 * Scanner(System.in);
 * 
 * System.out.println("Write a sentence: "); String sentence = scan.nextLine();
 * 
 * System.out
 * .println("Press \"1\" to capitalise \nPress \"2\" to decapitalise"); while (i
 * != 1 || i != 2) { i = scan.nextInt(); System.out.println(i); if (i != 1 || i
 * != 2) { System.out.println("Wrong input, try again"); }
 * System.out.println(i); }
 * 
 * if (i == 1) { sentence = sentence.toUpperCase();
 * System.out.println(sentence);
 * 
 * } else if (i == 2) { sentence = sentence.toLowerCase();
 * System.out.println(sentence); // efter "." ha en stor bokstav } else {
 * System.out.println("Something went wrong"); }
 * 
 * scan.close(); } }
 */