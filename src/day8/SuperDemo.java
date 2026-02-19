package day8;

public class SuperDemo {
    public static void main(String[] args) {

        Manager m1 = new Manager("Alice");
        System.out.println("-----------------");
        m1.work();
        System.out.println("-----------------");
        m1.displayTitles();

    }
}
class Employee{
    String jobTitle = "General Staff";

    Employee(String name){
        System.out.println("Employee constructor: " + name + " is hired");
    }
    void work(){
        System.out.println("Employee is doing basic work");
    }
}
class Manager extends Employee{
    String jobTitle = "Team Leader";

    Manager(String name){
        super(name);
        System.out.println("Manager constructor: Setup complete.");
    }
    void work(){
        super.work();
        System.out.println("Manager is supervising the team");
    }
    void displayTitles() {
        System.out.println("Manager Title: " + this.jobTitle);
        System.out.println("Parent Title: " + super.jobTitle);
    }
}



