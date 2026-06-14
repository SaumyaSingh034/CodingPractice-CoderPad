package June2026;

public class Singleton {
    private static Singleton singleton;

    private Singleton(){

    }

    public Singleton getSingletonInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
