public class crypt {
    public static void main(String[] args) {
        char m = 'H';
        char k = '(';
        char c = (char) cryptThis(m, k);
        char v = (char) deCryptThis(c, k);

        System.out.println(c);
        //System.out.println(Integer.toBinaryString(c));
        System.out.println(v);
        //System.out.println(Integer.toBinaryString(v));
    }

    private static int deCryptThis(int c, int k) {
        int out = c^k;
        return out;
    }

    private static int cryptThis(int m, int k) {
        int out = m^k;
        return out;
    }

}
