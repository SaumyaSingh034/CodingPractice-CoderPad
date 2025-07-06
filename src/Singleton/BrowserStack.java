package Singleton;

public class BrowserStack {

    private static ThreadLocal<BrowserStack> browserStack = new ThreadLocal<>();

    private BrowserStack(){

    }

    public static synchronized BrowserStack getInstance(){
        if(browserStack.get() == null){
            browserStack.set(new BrowserStack());
        }
        return browserStack.get();
    }
}
