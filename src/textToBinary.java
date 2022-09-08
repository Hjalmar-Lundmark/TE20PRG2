import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class textToBinary {
    public static void main(String[] args) {
        BufferedReader in = null;
        ArrayList<String> file = new ArrayList<>();
        String s = null;
        try {
            in = new BufferedReader( new FileReader("info.txt"));
            s = in.readLine();                      //idk vad jag gör här (jag glömde bort vad jag skulle göra innan while just under)
            while (s != null) {
                file.add(in.readLine());
            }
            for (int i = 0; i < file.size(); i++) {
                System.out.println(file.get(i));
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
