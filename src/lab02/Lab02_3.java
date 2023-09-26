package lab02;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Lab02_3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter height (m):");
            float inputHeight = scanner.nextFloat();
            System.out.println("Please enter weight (kg):");
            float inputWeight = scanner.nextFloat();
            // Formula:
            // BMI = weight / height^2
            // weight = BMI * height^2
            final float MIN_WEIGHT = 18.5f*inputHeight*inputHeight;
            final float MAX_WEIGHT = 24.9f*inputHeight*inputHeight;
            System.out.format("Your ideal minimum weight is %f.\n", MIN_WEIGHT);
            System.out.format("Your ideal maximum weight is %f.\n", MAX_WEIGHT);
            if (inputWeight < MIN_WEIGHT) {
                System.out.format("You need to gain at least %f kg", MIN_WEIGHT - inputWeight);
            } else {
                if (inputWeight > MAX_WEIGHT) {
                    System.out.format("You need to lose at least %f kg",  inputWeight - MAX_WEIGHT);
                } else {
                        System.out.format("You are perfect!");
                    }
            }
        }
}
