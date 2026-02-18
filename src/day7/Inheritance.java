package day7;



public class Inheritance {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Pragnay";
        s1.age = 18;
        s1.rollno = 58;
        s1.marks = 100;
        s1.displayPerson();
        s1.displayStudent();


    }
}
class Person{
    String name;
    int age;
    void displayPerson(){
        System.out.println("Person name:  "+ name);
        System.out.println("Person age:  "+ age);

    }
}
class Student extends Person{
    int rollno;
    int marks;

    void displayStudent(){
        System.out.println("Student rollno:  "+ rollno);
        System.out.println("Student marks:  "+ marks);

    }
}
