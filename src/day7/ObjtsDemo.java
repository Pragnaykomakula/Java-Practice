package day7;

public class ObjtsDemo{
    public static void main(String[] args) {

        Students student1 = new Students("pragnay",20,100);
        Students student2 = new Students("abhi",30,99);




    }
}
class Students{
    String name;
    int rollno;
    int marks;

    Students(String name,int rollno ,int marks){

        this.name = name;
        this.rollno = rollno;
        this.marks = marks;

    }

}
