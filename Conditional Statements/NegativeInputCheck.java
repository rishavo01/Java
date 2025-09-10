import java.util.Scanner;

public class NegativeInputCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number (negative to stop): ");
            number = sc.nextInt();
        } while (number >= 0);

        System.out.println("You entered a negative number. Program stopped.");
    }
}
