package day9;

public class EncapsulationTest {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        b1.setBalance(2000);
        System.out.println("Your balance is: $" + b1.getBalance());
        b1.setBalance(-500);

    }
}
class BankAccount{
    private double balance;

    public double getBalance(){
        return balance;
    }
    public void setBalance(double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Deposited amount: $" + balance);
        }
        else {
            System.out.println("Invalid deposit amount.");
        }
    }
}
