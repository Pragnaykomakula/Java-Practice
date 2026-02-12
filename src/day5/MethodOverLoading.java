package day5;

public class MethodOverLoading {
    public static void main(String[] args) {

        System.out.println("Area of square: "+ area(10));
        System.out.println("Area of rectangle: "+ area(10,20));
        System.out.println("Area of circle: "+ area(9.63));



    }static int area(int side){

        return side * side;
    }
    static int area(int length , int breadth){

        return length * breadth;
    }
    static double area(double radius){

        return 3.14 * radius * radius;
    }

}
