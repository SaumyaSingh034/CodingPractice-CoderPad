package MockInterview;

class Parent {
    public String name = "Parent";

    public void print() {
        System.out.println("Parent print()");
    }
}

class Child extends Parent {
    public String name = "Child";

    @Override
    public void print() {
        System.out.println("Child print()");
    }
}

public class TestPoly {
    public static void main(String[] args) {
        Parent obj = new Child();
        System.out.println(obj.name);
        obj.print();
    }
}
