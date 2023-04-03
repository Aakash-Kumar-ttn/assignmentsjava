package Q1;

public class WithThread extends Thread{

    private String MyThread;

    public WithThread(String MyThread) {
        this.MyThread = MyThread;
    }

    @Override
    public void run() {
        System.out.println("Thread Running " + MyThread);

        for (int i = 0; i < 5; i++) {
            System.out.println(MyThread + "  " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }

}
