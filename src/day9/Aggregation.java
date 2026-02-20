package day9;

public class Aggregation {
    public static void main(String[] args) {
        Author a1 = new Author("JK Rowling",65);
        Book b1 = new Book("Harry Potter" , 200,a1);

        b1.showDetails();

    }
}
class Author{
    String name;
    int age;

    Author(String name , int age){
        this.name = name;
        this.age = age;
    }
}
class Book{
    String name;
    double price;
    Author a1;

    Book(String name,double price,Author author ){
        this.name = name;
        this.price = price;
        this.a1 = author;
    }
    public void showDetails(){
        System.out.println("--- Book Info ---");
        System.out.println("Title: " + this.name);
        System.out.println("Price: $" + this.price);

        System.out.println("--- Author Info ---");
        System.out.println("Name: " + a1.name);
        System.out.println("Age: "+ a1.age);
    }
}

