import java.util.Random;
import java.util.Scanner;
public class Rolla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continueRolling = true;

        while (continueRolling) {
            System.out.printf("%-5s %-5s %-5s %-5s %-5s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("--------------------------------------------------------");
            int rollCount = 1;

            while (true) {
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-5d %-5d %-5d %-5d %-5d\n", rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    break;
                }

                rollCount++;
            }

            System.out.println("Would you like to roll again? (yes/no)");
            String response = scanner.next().toLowerCase();
            continueRolling = response.equals("yes");
        }

        scanner.close();
    }
}