package day7;



public class ArrayOfObjects {
    public static void main(String[] args) {

        Car car1 = new Car("blue","benz");
        Car car2 = new Car("red","audi");
        Car car3 = new Car("yellow","chervolet");

        Car [] cars = {car1,car2,car3};

        for( Car car : cars){
            car.display();

        }
    }
}
class Car{
    String color;
    String company;

    Car(String color,String company){
        this.color = color;
        this.company = company;
    }

    void display(){

        System.out.println("You drive a " + this.color +" " + this.company + " car");
    }


}