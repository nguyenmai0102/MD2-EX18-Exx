package chanLe2;

public class Count implements Runnable{
    private Thread myThread;

    public Count(){
        myThread = new Thread(this, "my runable thread");
        System.out.println("my thread created " + myThread);
        myThread.start();

    }

    Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 11; i++) {
                if (i%2==0){
                    System.out.println("in ra gia tri la so chan: " +i);
                    Thread.sleep(500);
                }else {
                    System.out.println("in ra gia tri le:" +i);
                }
            }
        }catch (InterruptedException e){
            System.out.println(" bi gian doan");
        }
        System.out.println("ket thuc viec chay");
    }
}
