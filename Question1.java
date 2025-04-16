
class Book {

    String title;
    String author;
    String yearofpublication;

    Book(String title, String author, String yearofpublication) {
        this.title = title;
        this.author = author;
        this.yearofpublication = yearofpublication;
    }

    void Display() {
        System.out.println("The title of book is : " + title);
        System.out.println("The author of book is : " + author);
        System.out.println("The year of publication of book is : " + yearofpublication);
    }
}

public class Question1 {

    public static void main(String[] args) {
        System.out.println("Name : Sumanth Deshpande");
        System.out.println("Roll.No : AV.SC.U4CSE24325");
        Book b1 = new Book("Harry Potter", "JK Rowling", "1971");
        Book b2 = new Book("Atomic Habbits ", "Albert Einstein ", "1969");
        b1.Display();
        b2.Display();
    }
}
