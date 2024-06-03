package lastpencil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        emptyPencil(7);
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of pencils
        System.out.println("How many pencils would you like to use:");
        int numPencils = scanner.nextInt();

        // Ask for the first player's name
        System.out.println("Who will be the first (Name1, Name2):");
        scanner.nextLine(); // Consume newline character
        String firstPlayer = scanner.nextLine();

        // Output the vertical bar symbols
        for (int i = 0; i < numPencils; i++) {
            System.out.print("|");
        }
        System.out.println();

        // Output the first player's name
        System.out.println(firstPlayer + " is going first!");

        scanner.close();
    }
//    public static void emptyPencil(int pencils){
//        System.out.println("|".repeat(pencils));
//        System.out.println("Your turn!");
//    }
}
