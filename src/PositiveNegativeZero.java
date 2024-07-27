/*
Challenge 1

	1.	Generate a Random Number.
	2.	Determine Sign of Number: Implement logic to determine if the number is positive, negative, or zero.
 */
import java.util.Random;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        numberGenerator();
    }

    public static void numberGenerator() {

        Random random = new Random();
        int randomInt = random.nextInt();
        System.out.println("Random number: "  + randomInt);

        if (randomInt > 0) {
            System.out.println("The number " + randomInt + " is positive");
        } else if (randomInt < 0){
            System.out.println("The number " + randomInt + " is negative");
        } else {
            System.out.println("The number is Zero");
        }
    }
}
