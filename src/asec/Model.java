package asec;

public class Model {

	private static String sentence;

	public static void setSentence(String sentence) {
		Model.sentence = sentence;
	}

	public String getSentence() {
		return sentence;
	}

	public static void capitalize(String input) {
		input = input.toUpperCase();
		setSentence(input);
	} // sentence only exists in the method, not when it is used??

	public static void decapitalize(String input) {
		input = input.toLowerCase();
		setSentence(input);
	}

}
