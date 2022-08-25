import javax.swing.*;

public class Greetings2 {
    public static void main(String[] args) {
        String in = JOptionPane.showInputDialog("Skriv något:");
        String out = "";
        int i = 0;

        if (in.charAt(0) == 'h' && in.charAt(in.length()-1) == 'y') {
            out = out + 'h';
            for (i = 0; i < (in.length()-2); i++) {
                out = out + 'e';
                out = out + 'e';
            }
            out = out + 'y';
            System.out.println(out);
        }
    }
}
