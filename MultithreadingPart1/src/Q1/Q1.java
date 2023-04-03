package Q1;
//Create and Run a Thread using Runnable Interface
// and Thread class and show usage of sleep and join methods in the created
public class Q1 {

    public static void main(String[] args) throws InterruptedException {

        WithThread t1 = new WithThread("threadfirst");
        WithThread t2 = new WithThread("ThreadSecond");
        WithThread t3 = new WithThread("ThreadThird");

//        t1.start();
//        t1.join();
//        t2.start();
//        t2.join();
//        t3.start();
//        t3.join();

        WithRunnable rn1 = new WithRunnable("YourThread1");
        WithRunnable rn2 = new WithRunnable("YourThread2");
        WithRunnable rn3 = new WithRunnable("YourThread3");
        Thread thrd1 = new Thread(rn1) ;
        Thread thrd2 = new Thread(rn2) ;
        Thread thrd3 = new Thread(rn3) ;


//        thrd1.start();
//        thrd2.start();
//        thrd2.start();

        try{
            thrd1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        thrd2.start();

        try{
            thrd2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        thrd3.start();


    }

}
