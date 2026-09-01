package September2026;

public class TestHashMap {
    public static void main(String[] args){
        Employee e1 = new Employee(101, "Saumya");
        Employee e2 = new Employee(101, "Saumya");

        System.out.println(e1.equals(e2)); //false
        System.out.println(e1.hashCode() == e2.hashCode()); //true
    }
}
