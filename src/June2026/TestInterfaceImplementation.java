package June2026;

public class TestInterfaceImplementation implements DataInterface{
    @Override
    public void display() {
        System.out.println("Hey this is Display Method");
    }

    @Override
    public void sleep() {
        DataInterface.super.sleep();
    }


    public static void main(String[] args){
        TestInterfaceImplementation tsi = new TestInterfaceImplementation();
        tsi.display();
        tsi.sleep();
        DataInterface.dataTest();
    }
}
