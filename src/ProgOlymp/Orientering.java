package ProgOlymp;

import javax.swing.*;

public class Orientering {
    public static void main(String[] args) {
        int N = 3;
        int svar = 0;

        String N2 = JOptionPane.showInputDialog(null, "Antal våningar?");
        N = Integer.parseInt(N2);


        int[] floor = new int[N];
        char[] stair = new char[N];

        for (int i = 0; i < N; i++) {
            String tempFloor = JOptionPane.showInputDialog(null, "Omr " + (i+1) + ", vån?");
            floor[i] = Integer.parseInt(tempFloor);
            String tempstair = JOptionPane.showInputDialog(null, "Omr " + (i+1) + ", trappa?");
            stair[i] = tempstair.charAt(0);
        }

        for (int o = 0; o < (N-1); o++) {

            svar += Math.abs((floor[o+1]-floor[o]));
        }
    }
}
