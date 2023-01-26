package RandomBS;

public class roller {
    public static void main(String[] args) throws InterruptedException {
        byte w = 0;

        while (true) {
            w++;
            System.out.println(w);
            //sleep
            Thread.sleep(25);
        }
    }
}
