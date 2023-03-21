public class Talkative implements Runnable {
    public static int number;
    public Talkative(int number){
        this.number=number;
    }
    public void print(){
        for (int i=0; i<100; i++){
            System.out.println(Thread.currentThread().getName()+" print number "+number);
        }
    }


    @Override
    public void run() {

        print();

    }
}
