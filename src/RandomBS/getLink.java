package RandomBS;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class getLink {
    public static void main(String[] args) throws IOException {
        URL resource = new URL("http://localhost:3000/"); // https doesn't works, http works
        Scanner scan = new Scanner(resource.openStream());
        /*
        HttpsURLConnection connection = (HttpsURLConnection)resource.openConnection();;
        Scanner scan = new Scanner(connection.getInputStream());
        */
        String s;
        String[] a;
        while (scan.hasNext()) {
            s = scan.nextLine();
            //System.out.println(s);
            if (s.contains("<a href")) {
                //System.out.println(s);
                a = s.split("\"");
                System.out.println(a[1]);
            }
        }

        System.out.println("\nAPI: ");
        System.out.println("Temperature is: " + getTemp("bygdea"));
    }

    public static String getTemp(String place) {
        String request = "http://api.temperatur.nu/tnu_1.17.php?p=" + place + "&cli=api_demo";
        String temperature = "";
        try {
            URL resource = new URL(request);
            Scanner urlScanner = new Scanner(resource.openStream());
            String result = urlScanner.nextLine();
            temperature = result.split("\"")[23];
        } catch (Exception e) {
            e.printStackTrace();
        }
        return temperature;
    }
}
