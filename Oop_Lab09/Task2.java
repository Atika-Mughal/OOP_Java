class Task2 {
	public static void main (String[]args) {

		String text = "level";
		String temp = "";

		for (int i=text.length()-1; i>=0; i--) 
			temp = temp + text.charAt(i);
		
		if (text.equals(temp)){
			System.out.println("true");
		}
	    else {
	    	System.out.println("false");
	    }
	}
}