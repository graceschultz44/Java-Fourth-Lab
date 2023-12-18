// Grace Schultz
// 48761302
// Lab 5-Fall 2022

import java.util.Scanner; // imports scanner
import java.util.Random; // imports random

public class Slots3 {
    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) { // main method
        String[] amount = new String[3];
        System.out.print("How much money would you like to insert? ");
        double money = input.nextDouble();
        while (true) {
            System.out.print("Spin/Quit (S/Q) : ");
            String choice = input.next();
            if (choice.equalsIgnoreCase("S")) { // ignores case
                System.out.println("Paid 0.25 to spin...");
                money -= 0.25;
                for (int i = 0; i < 3; i++) {
                    amount[i] = spinWheel();
                    System.out.println(" " + amount[i]);
                }
            } else if (choice.equalsIgnoreCase("Q")) {
                break;
            }
            money += checkWinner(amount[0], amount[1], amount[2]);
            System.out.printf("Now have $%.2f\n", money);
        }
    }

    public static String spinWheel() {
        String[] names = {"Mickey", "Minnie", "Donald", "Daisy"};
        int randNum = rand.nextInt(4);
        String answer = names[randNum];
        return answer;
    }

    public static double checkWinner(String one, String two, String three) { // checks winners
        if (one.equals(two) && two.equals(three) && one.equals(three)) {
            System.out.println("Won $1");
            return 1.0;
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
