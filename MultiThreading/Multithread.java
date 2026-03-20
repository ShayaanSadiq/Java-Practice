public class Multithread {
    public static void main(String[] args) {
        
        Thread thread1 = new Thread(new MyRunnable2("ping"));
        Thread thread2 = new Thread(new MyRunnable2("pong"));

        System.out.println("Game start!");

        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread was interrupted.");
        }

        System.out.println("Game over!");

    }
}
