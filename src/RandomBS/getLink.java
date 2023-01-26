package RandomBS;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class getLink {
    public static void main(String[] args) throws IOException {
        URL resource = new URL("http://localhost:3000/"); // https doesn't works, http works
        Scanner scan = new Scanner(resource.openStream());
        String s = "";
        String[] a;
        while (scan.hasNext()) {
            s = scan.nextLine();
            //System.out.println(s);
            if (s.contains("<a href")) {
                System.out.println(s);
                a = s.split("\"");
                System.out.println(a[1]);   //maybe not always work?
            }
        }
    }
}
