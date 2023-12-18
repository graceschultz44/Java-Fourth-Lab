// Grace Schultz
// 48761302
// Lab 5-Fall 2022

import java.util.Scanner; // import scanner
import java.util.Random; // import random

public class Slots1 {
    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) { // main method
        while (true) {
            System.out.print("Spin/Quit (S/Q) : ");
            String choice = input.next();
            if (choice.equalsIgnoreCase("S")) { // ignores case
                for (int i = 0; i < 3; i++) {
                    System.out.println(" " + spinWheel());
                    System.out.println(" ");
                }
            }
            else if (choice.equalsIgnoreCase("Q")) {
                    break;
                }
            }
        }

public static String spinWheel() {
    String[] names = {"Mickey", "Minnie", "Donald", "Daisy"};
    int randNum = rand.nextInt(4);
    String answer = names[randNum];
    return answer;
}
}