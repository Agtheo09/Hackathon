import java.util.Scanner;

public class Hackathon {
    public static void main(String[] args) {
        int minTestRange = 1;
        int maxTestRange = 128;
        int numberPickedByComputer = 0;
        char userResponse = 'h';
        Scanner scan = new Scanner(System.in);

        System.out.println("Pick a number between 1 to 128.");
        numberPickedByComputer = (minTestRange + ((maxTestRange - minTestRange) / 2));
        while(userResponse != 'Y') {
            System.out.println("Is your number " + numberPickedByComputer + " (Y, H, L): ");
            userResponse = scan.next().charAt(0);

            if(userResponse == 'Y') {
                System.out.println("I found it!!!");
            } else if(userResponse == 'H') {
                if(minTestRange == (maxTestRange - 2)) {
                    System.out.println("Your number is: " + maxTestRange);
                    userResponse = 'Y';
                }
                minTestRange = numberPickedByComputer;
            } else if (userResponse == 'L') {
                maxTestRange = numberPickedByComputer;
                if(maxTestRange == (minTestRange - 2)) {
                    System.out.println("Your number is: " + maxTestRange);
                    userResponse = 'Y';
                }
            } else {
                System.out.println("Error! Bad Character!!!");
            }
            numberPickedByComputer = (minTestRange + ((maxTestRange - minTestRange) / 2));
        }

        scan.close();
    }
}
