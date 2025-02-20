class Book {

String title;
String author;
boolean isAvailable = true;

Book (String title, String author) {
this.title = title;
this.author = author;
}

void checkBook() {
    System.out.println("Check that book is avaliable or not: " + isAvailable);
}

void borrowBook() {
     if (isAvailable) {
        isAvailable = false;
     System.out.println("The book is Borrowed Successfully");
     System.out.println("Status: " + isAvailable);
}
else {
     System.out.println("Book is not available");
}
}
void returnBook() {
    isAvailable = true;
    System.out.println("Now book is Available");
    System.out.println("Status: " + isAvailable);
}
void display () {
    System.out.println("Book title: " + title);
    System.out.println("Author's name: " + author);
    System.out.println("Availability Status: " + isAvailable);
}

public static void main (String[] args) {
   Book b1 = new Book ("To kill a mocking bird", "Harper lee");

b1.checkBook();
b1.borrowBook();
b1.borrowBook();
b1.returnBook();
b1.checkBook();
b1.display();




}
}