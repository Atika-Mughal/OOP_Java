class Task4 {
	public static void VowelsandConsonants(String str) {
		int vowels = 0;
		int consonants = 0;

		for (int i=0; i<str.length(); i++) {
			char alphabet = str.charAt(i);
			if (alphabet >= 'a' && alphabet <= 'z') {
				if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
					vowels++;
				}
				else {
					consonants++;
				}
			}
		}
		System.out.println("Vowels: " + vowels + " Consonants: " + consonants);
	}
	public static void main (String[]args) {
		VowelsandConsonants("hello world");
	}
}