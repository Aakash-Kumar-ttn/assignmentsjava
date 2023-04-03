package Q1;

public class WithRunnable implements Runnable{
    private String MyThread;

    public WithRunnable(String myThread) {
        MyThread = myThread;
    }
    public void run(){
        //task

        System.out.println("Thread Running " + MyThread);

        for(int i= 0 ; i<5 ; i++){
            System.out.println(MyThread + "  " + i);
        }

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work finished Thread end");
    }
}
