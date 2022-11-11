package RandomBS;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class textToBinary {
    public static void main(String[] args) {
        try {
            //DataOutputStream output = new DataOutputStream (new BufferedOutputStream(new FileOutputStream("siffror.txt")));
            String filnamn = "info.txt";
            FileWriter fw = new FileWriter(filnamn);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter utFil = new PrintWriter(bw);

            int x;
            Random r = new Random();

            for (int i = 0 ; i < 1920*1080 ; i++) {
                x = r.nextInt(0xffffff);
                //output.writeInt(x);
                utFil.println(x);
            }

            utFil.flush();
            //output.close();
            utFil.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // String s = infile.readline               //????
        // int x = Integer.parseInt(s)
        /*
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
        */


    }
}
