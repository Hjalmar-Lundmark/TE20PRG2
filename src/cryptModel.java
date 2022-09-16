import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class cryptModel {
    String filnamn = "meddelande.txt";
    String meddelande;
    String keyfilnamn = "key.txt";
    String key;
    String crypted;

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

    public void readKey() {
        FileReader fr2 = null;
        try {
            fr2 = new FileReader(keyfilnamn);
            BufferedReader inFil = new BufferedReader(fr2);
            key = inFil.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String encrypt(String meddelande, String key) {
        String out = "";
        char keey = key.charAt(0);
        for (int i = 0; i < meddelande.length(); i++) {
            char cIn = meddelande.charAt(i);
            char cOut = (char) (cIn^keey);
            out = out + cOut;
        }
        return out;
    }

    public static void main(String[] args) {
        cryptModel test = new cryptModel();

        test.readTextFile();
        test.crypt();

        System.out.println(test.crypted);
    }
}
// I psvm här över blir det problem om antingen inget annat är static
// ELLER om jag inte gjort en variabel av programmet och kört i det(alltså vad som står här just över)
// dock så testade jag att göra allt i static och det är det som är här under.
// Både fungerar helt och likadant just nu.

/*
public class cryptModel {
    static String filnamn = "meddelande.txt";
    static String meddelande;
    static String keyfilnamn = "key.txt";
    static String key;
    static String crypted;

    public static String readTextFile(String filnamn, String meddelande) {
        FileReader fr = null;
        try {
            fr = new FileReader(filnamn);
            BufferedReader inFil = new BufferedReader(fr);
            meddelande = inFil.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return meddelande;
    }

    public static String crypt(String key, String crypted, String meddelande) {
        if (key == null) {
            key = readKey(key, keyfilnamn);
        }
        crypted = encrypt(meddelande, key);
        return crypted;
    }

    public static String  readKey(String key, String keyfilnamn) {
        FileReader fr2 = null;
        try {
            fr2 = new FileReader(keyfilnamn);
            BufferedReader inFil = new BufferedReader(fr2);
            key = inFil.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return key;
    }

    public static String encrypt(String meddelande, String key) {
        String out = "";
        char keey = key.charAt(0);
        for (int i = 0; i < meddelande.length(); i++) {
            char cIn = meddelande.charAt(i);
            char cOut = (char) (cIn^keey);
            out = out + cOut;
        }
        return out;
    }

    public static void main(String[] args) {
        meddelande = readTextFile(filnamn, meddelande);
        crypted = crypt(key, crypted, meddelande);

        System.out.println(crypted);
    }
}
*/