package January_2026;

public class ThreadSafePrinting {
    private int number = 1;
    private final int MAX = 10;

    public synchronized void printOdd(){
        while(number <= MAX) {
            if( number % 2 ==0 ){
                try{
                    wait();
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            } else {
                System.out.println(Thread.currentThread().getName()+ " : "+ number++);
            }
        }
    }


    public synchronized void printEven(){
        while(number <= MAX) {
            if( number % 2 != 0 ){
                try{
                    wait();
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            } else {
                System.out.println(Thread.currentThread().getName()+ " : "+ number++);
            }
        }
    }

    public static void main(String[] args) {

        ThreadSafePrinting printer = new ThreadSafePrinting();

        Thread oddThread = new Thread(printer::printOdd, "Odd-Thread");
        Thread evenThread = new Thread(printer::printEven, "Even-Thread");

        oddThread.start();
        evenThread.start();
    }

}
