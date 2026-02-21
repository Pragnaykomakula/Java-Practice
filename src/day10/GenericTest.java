package day10;

public class GenericTest {
    public static void main(String[] args) {

        Box<Integer> box1 = new Box<>(100);
        Box<String> box2 = new Box<>("Apple");

        System.out.println("Box 1 contains integers:"+ box1.getItem());
        System.out.println("Box 2 contains String:"+ box2.getItem());

    }
}
class Box<T>{
     T item;
    Box(T item){
        this.item = item;
    }
     public T getItem(){
        return item;
     }
}
