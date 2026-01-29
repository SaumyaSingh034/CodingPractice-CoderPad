package Advanced;

public class SingletonWebDriver {
    private static SingletonWebDriver webDriver = null;

    private SingletonWebDriver(){

    }

    public static void getDriver(){
        if(webDriver == null){
            webDriver = new SingletonWebDriver();
        }
    }

}
