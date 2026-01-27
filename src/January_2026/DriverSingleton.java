package January_2026;

public class DriverSingleton {

    private static DriverSingleton driver;

    private DriverSingleton(){

    }

    public static synchronized DriverSingleton getDriver(){
        if(driver == null ){
            driver = new DriverSingleton();
        }
        return driver;
    }


}
