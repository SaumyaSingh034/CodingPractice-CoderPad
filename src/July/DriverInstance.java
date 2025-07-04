package July;

public class DriverInstance {
    public static DriverInstance driver;

    private DriverInstance(){

    }


    public static DriverInstance getInstance(){
        if(driver == null){
            driver = new DriverInstance();
        }
        return driver;
    }
}
