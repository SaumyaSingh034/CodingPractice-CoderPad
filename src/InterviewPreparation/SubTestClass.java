package InterviewPreparation;

public class SubTestClass implements TestInterface{
    @Override
    public void display() {
        System.out.println("Hello Display");
    }

    @Override
    public void teams() {
        System.out.println("Hello Teams");
    }
}
