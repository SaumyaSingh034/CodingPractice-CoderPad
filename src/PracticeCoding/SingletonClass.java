package PracticeCoding;

public class SingletonClass
{
    private static SingletonClass singletonClass;

    private SingletonClass(){

    }
    public SingletonClass getInstance(){
        singletonClass = new SingletonClass();
        return singletonClass;
    }

}
