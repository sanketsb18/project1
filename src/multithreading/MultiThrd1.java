package multithreading;

public class MultiThrd1 extends Thread {
    public void run() {
        for(int i = 0; i<5; i++) {
            try {
                Thread.sleep(700);
                System.out.println("Running Thread name :" + currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MultiThrd1 Thread1 = new MultiThrd1();
        MultiThrd1 Thread2 = new MultiThrd1();
        MultiThrd1 Thread3 = new MultiThrd1();

        Thread1.setName("A");
        Thread2.setName("B");
        Thread3.setName("C");
        Thread1.start();
        Thread3.start();
        Thread2.join();
        Thread2.start();
    }
}
