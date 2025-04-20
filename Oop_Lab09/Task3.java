class Task3 {
	public static int longestsubstring(String str) {
		int max = 0;
		for (int i=0; i<str.length(); i++) {
			String temp = "";
			for (int j=0; j<str.length(); j++) {
				char text = str.charAt(j);

				if (temp.indexOf(text) == -1) {
					temp += text;
					if (temp.length() > max) {
						max = temp.length();
					}
					else {
						break;
					}
				}
			}
		}
		return max;
	}
	public static void main (String[]args) {
		System.out.println("Longest Substring: " + longestsubstring("abcdabcada"));
	}
}