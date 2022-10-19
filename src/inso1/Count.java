package inso1;

public class Count implements Runnable {

    private Thread myThread;

    public Count() {
        myThread = new Thread(this, "my runnable thread");
        System.out.println("my thread created" + myThread);
        myThread.start();
    }
    Thread getMyThread(){
        return  myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i < 11; i++) {
                System.out.println("in ra gia tri: "+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("bi gian doan");
        }
        System.out.println("ket thuc viec chay");
    }
}
