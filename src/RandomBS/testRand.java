package RandomBS;

public class testRand {
    public static void main(String[] args) {
        int rand;
        for (int i = 0; i< 10; i++) {
            rand = (int) (Math.random()*2);
            System.out.println(rand);
        }
    }
}
