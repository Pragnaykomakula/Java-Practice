package day8;

public class Abstraction {
    public static void main(String[] args) {

        CreditCard c1 = new CreditCard(300.30);
        c1.makePayment();
        c1.printReceipt();
        System.out.println("-----------------");

        Cash c2 = new Cash(250.25);
        c2.makePayment();
        c2.printReceipt();

    }
}

abstract class Payment{
    double amount;

    Payment(double amount){
        this.amount = amount;
    }

    void printReceipt(){
        System.out.println("Receipt generated for $"+ amount);
    }
    abstract void makePayment();

}

class CreditCard extends Payment{
    CreditCard(double amount){
        super(amount);
    }
    @Override
    void makePayment(){
        System.out.println("Processing credit card payment of $"+ amount +" Charge successful.");
    }

}

class Cash extends Payment{
    Cash(double amount){
        super(amount);
    }
    @Override
    void makePayment(){
        System.out.println("Counting cash");

    }
}

