import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class cryptModel {
    String filnamn = "meddelande.txt";
    String meddelande;
    String keyfilnamn = "key.txt";
    String key;
    private static String crypted;

    public void readTextFile() {
        FileReader fr = null;
        try {
            fr = new FileReader(filnamn);
            BufferedReader inFil = new BufferedReader(fr);
            meddelande = inFil.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void crypt() {
        if (key == null) {
            readKey();
        }
        crypted = encrypt(meddelande, key);
    }

    private void readKey() {
        FileReader fr = null;
        try {
            fr = new FileReader(filnamn);
            BufferedReader inFil = new BufferedReader(fr);
            key = inFil.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String encrypt(String meddelande, String key) {
        String out = "";
        char keey = key.charAt(0);
        for (int i = 0; i < meddelande.length(); i++) {
            char cIn = meddelande.charAt(i);
            char cOut = (char) (cIn^keey);
            out = out + cOut;
        }
        return out;
    }

}
