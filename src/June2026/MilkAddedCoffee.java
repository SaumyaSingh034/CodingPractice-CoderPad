package June2026;

public class MilkAddedCoffee implements Coffee{
    private Coffee coffee;
    public MilkAddedCoffee(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public void prepare() {
        coffee.prepare();
        System.out.println("Milk Added Coffee");
    }

//    public static void main(String[] args){
//        MilkAddedCoffee m = new MilkAddedCoffee(co);
//    }
}
