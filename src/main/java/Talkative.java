public class Talkative implements Runnable {
    private int number;
    public Talkative(int number){
        this.number=number;
    }
    public void print(){
        for (int i=0; i<100; i++){
            System.out.println("Thread number "+number);
        }
    }


    @Override
    public void run() {

        print();

    }
}
