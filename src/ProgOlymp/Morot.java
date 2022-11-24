package ProgOlymp;

import javax.swing.*;

public class Morot {
    public static void main(String[] args) {
        int torTime = 5;
        int morTime = 3;
        int torEaten = 0;
        int morEaten = 0;
        int morotter = 40;
        int totalTime = 0;

        String torTime2 = JOptionPane.showInputDialog(null, "Tors tid?");
        torTime = Integer.parseInt(torTime2);
        String morTime2 = JOptionPane.showInputDialog(null, "Mors tid?");
        morTime = Integer.parseInt(morTime2);


        while (true) {
            if (morotter == 1 && totalTime % torTime == 0 && totalTime % morTime == 0) {
                break;
            }
            if ((totalTime % torTime) == 0) {
                morotter -= 1;
                torEaten++;
            }
            if ((totalTime % morTime) == 0) {
                morotter -= 1;
                morEaten++;
            }
            if (morotter == 0) {
                break;
            }

            totalTime++;
        }


        System.out.println("Tor har ätit: " + torEaten + " morötter och mor har ätit: " + morEaten + " morötter");
        System.out.println("Bonus! det tog " + totalTime + " tidsenheter");
    }
}
