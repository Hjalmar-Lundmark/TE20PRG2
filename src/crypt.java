public class crypt {
    public static void main(String[] args) {
        char m = 'H';
        char k = '(';
        String test = "Hej";
        String crypted = cryptThisString(test, k);
        String decrypted = deCryptThisString(crypted, k);

        String hexCrypt = cryptHexThis(test, k);
        //String hexDeCrypt = deCryptHexThis(hexCrypt, k);

        char c = (char) cryptThis(m, k);
        char v = (char) deCryptThis(c, k);

        System.out.println(hexCrypt);               // Del 3: Fungerar? tror jag
        //System.out.println(hexDeCrypt);             // Del 3: Fungerar inte
        //System.out.println(crypted);              // Del 2
        //System.out.println(decrypted);            // Del 2
        //System.out.println(c);                    // Del 1
        //System.out.println(v);                    // Del 1
        //System.out.println(Integer.toBinaryString(c));
        //System.out.println(Integer.toBinaryString(v));
    }
    /*
    private static String deCryptHexThis(String in, char key) {
        String hex = "";
        String out = "";
        for (int i = 0; i < in.length(); i++) {
            char cIn = in.charAt(i);
            char cIn2 = in.charAt(i+1);
            hex = cIn + "" + cIn2;
            String cOut = (String)(hex^key);
            String sOut = Integer.toHexString(cOut);
            out = out + sOut;
        }
        return out;
    }

     */

    private static String cryptHexThis(String in, int key) {
        String out = "";
        for (int i = 0; i < in.length(); i++) {
            char cIn = in.charAt(i);
            char cOut = (char) (cIn^key);
            String sOut = Integer.toHexString(cOut);
            out = out + sOut;
        }
        return out;
    }

    private static String deCryptThisString(String in, int key) {
        String out = "";
        for (int i = 0; i < in.length(); i++) {
            char cIn = in.charAt(i);
            char cOut = (char) (cIn^key);
            out = out + cOut;
        }
        return out;
    }

    private static String cryptThisString(String in, int key) {
        String out = "";
        for (int i = 0; i < in.length(); i++) {
            char cIn = in.charAt(i);
            char cOut = (char) (cIn^key);
            out = out + cOut;
        }
        return out;
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
