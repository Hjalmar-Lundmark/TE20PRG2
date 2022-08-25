import javax.swing.*;

public class HissingMic {
    public static void main(String[] args) {
        String in = JOptionPane.showInputDialog("Skriv något:");
        String out = "hiss";

        if (in.contains("ss")) {
            System.out.println(out);
        } else {
            System.out.println("no " + out);
        }
    }
}
