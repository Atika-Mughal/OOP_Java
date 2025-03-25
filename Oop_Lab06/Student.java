class Student extends Person {

String studentID;
Student (String name, int age, String studentID) {
super(name, age);
this.studentID = studentID;
}

void displayInfo() {
System.out.println("Name: " + super.name + " Age: " + super.age + " ID: " + studentID);
}
}