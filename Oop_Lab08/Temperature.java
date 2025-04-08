class Temperature {
	private double celsius;

	Temperature (double celsius) {
	   this.celsius = celsius;
	} 

	void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	double getFarhenheit() {
		return celsius*9/5 + 32;
	}
	public static void main (String[]args) {
	Temperature t = new Temperature(25);
	t.setCelsius(25);
	System.out.println("Farhenheit: " + t.getFarhenheit());
    }
}