class Student {

private String name;
private int rollnum;
private String grade;

	Student (String name, int rollnum, String grade) {
      this.name = name;
      this.rollnum = rollnum;
      this.grade = grade;
	}
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	int getRollnum() {
		return rollnum;
	}
	void setGrade(String grade) {
		this.grade = grade;
	}
	String getGrade() {
		return grade;
	}
	void Displaydetails() {
		System.out.println("Name: " + name + " Roll No:" + rollnum + " Grade: " + grade);
	}
	public static void main (String[]args) {
		Student s1 = new Student("Atika", 90, "AI");
		s1.setName("Atika");
		s1.setRollnum(90);
		s1.setGrade("AI");
		s1.Displaydetails();
	}
}