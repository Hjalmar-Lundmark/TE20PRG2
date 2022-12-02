package AOC2022;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class dec2 {
    public static void main(String[] args) {
        int points = 0;
        String full = "";
        String line = "";
        int start = 0;
        //A for Rock, B for Paper, and C for Scissors
        //X for Rock, Y for Paper, and Z for Scissors
        //Points:
        //1 for Rock, 2 for Paper, and 3 for Scissors
        //0 if you lost, 3 if the round was a draw, and 6 if you won

        full = readFile("dec2.txt");

        while (true) {
            line = "";
            for (int i = 0; i < 3; i++) {
                line += full.charAt(start);
                start++;
            }
            if (start > full.length()) {
                break;
            }

            //Something wrong with if/else????
            if (line.contains("A")) {
                if (line.contains("X")) {
                    points += 4;
                } else if (line.contains("Y")) {
                    points += 8;
                } else if (line.contains("Z")) {
                    points += 3;
                }
            } else if (line.contains("B")) {
                if (line.contains("X")) {
                    points += 1;
                } else if (line.contains("Y")) {
                    points += 5;
                } else if (line.contains("Z")) {
                    points += 9;
                }
            } else if (line.contains("C")) {
                if (line.contains("X")) {
                    points += 7;
                } else if (line.contains("Y")) {
                    points += 2;
                } else if (line.contains("Z")) {
                    points += 6;
                }
            }
            if (start >= full.length()) {
                break;
            }
        }

        System.out.println(points);
    }

    public static String readFile(String filnamn) {
        FileReader fr = null;
        String meddelande = "";
        String m2;
        try {
            fr = new FileReader(filnamn);
            BufferedReader inFil = new BufferedReader(fr);
            m2 = inFil.readLine();
            while (m2 != null) {
                //System.out.println(meddelande);
                // read next line
                meddelande += m2;
                //meddelande += " ";
                m2 = inFil.readLine();
            }

            inFil.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return meddelande;
    }
}
