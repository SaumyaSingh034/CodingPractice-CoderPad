package CodePardFinal;

public class Project {

    public Project(){
        //Deafult Constructor
        System.out.println("Deafult Constructor");
    }

    int a;
    int b;
    public Project(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println(a+" --> "+b);
    }


    public static void main(String[] args){
        Project p = new Project();
        Project p1 = new Project(5,8);
    }
}
