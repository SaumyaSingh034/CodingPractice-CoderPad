package July;

public class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");
    }

    public void display(){
        System.out.println("Display --> Child");
    }

    public static void print(){
        System.out.println("Print ---> Child");
    }

    public static void main(String[] args){
        Child c = new Child();
        c.display();
        Child.print();
        System.out.println("*************************");
        Parent p = new Child();
        p.display();

        Parent p1 = new Parent();
        p1.display();

    }
}
