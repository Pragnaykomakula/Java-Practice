package day8;

public class Polymorphism {
    public static void main(String[] args) {



        Worker w1 = new Worker(20000.50);
        Worker w2 = new Developer(10000.50);
        Worker w3 = new Managr(66600.0);

        System.out.println("Standard Worker Bonus: $" + w1.calculateBonus());
        System.out.println("Developer Bonus: $" + w2.calculateBonus());
        System.out.println("Manager Bonus: $" + w3.calculateBonus());

    }
}
class Worker{
    double salary;
    Worker(double salary){
        this.salary = salary;
    }
    public double calculateBonus(){
        return salary * 0.05;
    }
}
class Developer extends Worker{

    Developer(double salary){
        super(salary);
    }

    public double calculateBonus() {
        return salary * 0.10;
    }
}
class Managr extends Worker{
    Managr(double salary){
        super(salary);
    }
    public double calculateBonus() {
        return salary * 0.15;
    }
}
