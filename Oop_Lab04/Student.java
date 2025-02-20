class Student {

String name;
String id;
double[] grades = new double [5];

Student (String name, String id, double[] grades) {
this.name = name;
this.id = id;
this.grades = grades;
}

void display_average () {
double sum = 0;
  for (double grad:grades) {
    sum += grad;
}
double average = sum/grades.length;
System.out.println("The Average of: " + name + average);
}

double cal_percentage() {
double sum = 0;
for (double grad:grades) {
sum += grad;
}

double percentage = sum/1000*100;
System.out.println("The percentage of: " + name + percentage);
return percentage;
}

String concat_id_name () {
System.out.println("Concatenated name and Id: " + name + "_" + id);
return id + name;
}

public static void main (String[] args) {

double[] grades1 = {180, 190, 199, 185, 195};
double[] grades2 = {193, 280, 165, 120, 100};

Student S1 = new Student ("Atika", "A0090", grades1);
Student S2 = new Student ("Fariha", "A0091", grades2);

S1.display_average();
S1.cal_percentage();
S1.concat_id_name();
S2.display_average();
S2.cal_percentage();
S2.concat_id_name();

}
}