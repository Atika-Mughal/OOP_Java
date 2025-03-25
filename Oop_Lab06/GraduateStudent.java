class GraduateStudent extends Student {

String researchTopic;
GraduateStudent (String name, int age, String studentID, String researchTopic) {
super(name, age, studentID);
this.researchTopic = researchTopic;
}

void displayInfo() {
System.out.println("Name: " + super.name + " Age: " + super.age + " ID: " + studentID + " Topic: " + researchTopic);
}
}