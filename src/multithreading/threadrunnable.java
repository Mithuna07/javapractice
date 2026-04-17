package multithreading;

public class threadrunnable implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        for(int i=0;i<5;i++){
            threadrunnable task = new threadrunnable();   //task
            Thread t = new Thread(task);
            t.start();
        }
    }
}
