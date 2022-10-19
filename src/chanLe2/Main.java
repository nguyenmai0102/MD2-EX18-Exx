package chanLe2;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        try {
            while (count.getMyThread().isAlive()) {
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
            System.out.println(" chay bi gian doan");
        }
        System.out.println("ket thuc chay");
    }
}
