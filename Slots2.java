// Grace Schultz
// 48761302
// Lab 5-Fall 2022

import java.util.Scanner; // import scanner
import java.util.Random; // import random

public class Slots2 {
    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) { // main method
        String[] amount = new String[3];
        while (true) {
            System.out.print("Spin/Quit (S/Q) : ");
            String choice = input.next();
            if (choice.equalsIgnoreCase("S")) { // ignores case
                for (int i = 0; i < 3; i++) {
                    amount[i] = spinWheel();
                    System.out.println(" " + amount[i]);
                }
            } else if (choice.equalsIgnoreCase("Q")) { // ignores case
                break;
            }
            checkWinner(amount[0], amount[1], amount[2]); // checks winner
        }
    }

    public static String spinWheel() {
        String[] names = {"Mickey", "Minnie", "Donald", "Daisy"};
        int randNum = rand.nextInt(4);
        String answer = names[randNum];
        return answer;
    }

    public static double checkWinner(String one, String two, String three) {
        if (one.equals(two) && two.equals(three) && one.equals(three)) {
            System.out.println("Won $1");
            return 1.0; // checks winner
        }
        if (one.equals(two) || two.equals(three) || one.equals(three)) {
            System.out.println("Won 50 cents");
            return 0.50;
        } else {
            System.out.println("No prize");
            return 0.0;
        }
    }
}


