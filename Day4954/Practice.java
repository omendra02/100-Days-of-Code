package Day4954;
import java.util.Random;

public class Practice{

public class ItemCostCalculator {
    public static void main(String[] args) {
        double itemPrice = 10.00;
        int numberOfItems = 5;
        double taxRate = 8.0 / 100;
        double discountPercentage = 10.0 / 100;

        double subtotal = itemPrice * numberOfItems;
        double taxAmount = subtotal * taxRate;
        double discountAmount = subtotal * discountPercentage;
        double totalCost = subtotal + taxAmount - discountAmount;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax Amount: $" + taxAmount);
        System.out.println("Discount Amount: $" + discountAmount);
        System.out.println("Total Cost: $" + totalCost);
    }
}



public class DiceGame {
    public static void main(String[] args) {
        final int WINNING_SCORE = 50;
        int player1Score = 0, player2Score = 0;

        Random rand = new Random();
        while (player1Score < WINNING_SCORE && player2Score < WINNING_SCORE) {
            player1Score += rand.nextInt(6) + 1;
            player2Score += rand.nextInt(6) + 1;
            System.out.println("Player 1 Score: " + player1Score);
            System.out.println("Player 2 Score: " + player2Score);
        }

        if (player1Score >= WINNING_SCORE) {
            System.out.println("Player 1 wins with a score of " + player1Score);
        } else {
            System.out.println("Player 2 wins with a score of " + player2Score);
        }
    }
}


public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Hello World Java";
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }

        System.out.println("Reversed Sentence: " + reversedSentence.toString().trim());
    }
}


import java.util.Scanner;

public class TemperatureAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days in the week: ");
        int numOfDays = scanner.nextInt();
        int[] temperatures = new int[numOfDays];

        for (int i = 0; i < numOfDays; i++) {
            System.out.print("Enter the temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextInt();
        }

        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int above80 = 0;
        int below60 = 0;

        for (int temp : temperatures) {
            sum += temp;
            if (temp > highest) highest = temp;
            if (temp < lowest) lowest = temp;
            if (temp > 80) above80++;
            if (temp < 60) below60++;
        }

        double average = (double) sum / numOfDays;

        System.out.println("Average Daily Temperature: " + average);
        System.out.println("Highest Daily Temperature: " + highest);
        System.out.println("Lowest Daily Temperature: " + lowest);
        System.out.println("Number of Days with Temperatures Above 80°F: " + above80);
        System.out.println("Number of Days with Temperatures Below 60°F: " + below60);

        scanner.close();
    }
}
}

