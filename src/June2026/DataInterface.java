package June2026;

public interface DataInterface {

     void display();

     default void sleep(){
         System.out.println("Hey I am sleeping");
     }

      static void dataTest(){
         System.out.println("Hey this is data test");
     }
}
