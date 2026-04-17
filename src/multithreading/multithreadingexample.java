package multithreading;

public class multithreadingexample extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            multithreadingexample t = new multithreadingexample();
            t.start();
        }
    }
}