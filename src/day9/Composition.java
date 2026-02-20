package day9;

public class Composition {
    public static void main(String[] args) {

        Human human1 = new Human("Jon");
        human1.live();

    }
}
class Human{
    String name;
    Heart h1;

    Human(String name){
        this.name = name;
        this.h1 = new Heart(98);
    }
    public void live(){
        System.out.println(this.name+" " + "is alive!");
        h1.pump();

    }
}
class Heart{
    int beatsPerMinute;
    Heart(int beats){
        this.beatsPerMinute = beats;
    }
    public void pump(){
        System.out.println("Heart is is pumping at "+ this.beatsPerMinute + " bpm");
    }
}
