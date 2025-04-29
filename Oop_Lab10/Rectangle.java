class Rectangle extends Shape implements Printable {

	int width;
	int height;
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int Area() {
        return width * height;
	}
	public void Print() {
		System.out.println("this is printable method.");
	}
}

