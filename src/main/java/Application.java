public class Application {
    public static void main(String[] args) {



               Thread thread = new Thread(new Talkative(0));
               thread.setName("Thread"+0);
               thread.start();

            Thread thread1 = new Thread(new Talkative(1));
            thread1.setName("Thread"+1);
            thread1.start();

        Thread thread2 = new Thread(new Talkative(2));
        thread2.setName("Thread"+2);
        thread2.start();

       }

}
