package lab02;
import java.util.Scanner;
public class Lab02_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter height (m):");
        float inputHeight = scanner.nextFloat();
        System.out.println("Please enter weight (kg):");
        float inputWeight = scanner.nextFloat();
        // formula BMI = weight / height^2
        float calculateBMI = inputWeight / (inputHeight * inputHeight);
        if (calculateBMI < 18.5) {
            System.out.format("Your BMI is %f. You are underweight!", calculateBMI);
        } else {
            if (calculateBMI < 25) {
                System.out.format("Your BMI is %f. You are normal weight!", calculateBMI);
            } else {
                if (calculateBMI < 30) {
                    System.out.format("Your BMI is %f. You are overweight!", calculateBMI);
                } else {
                    System.out.format("Your BMI is %f. You are obesity!", calculateBMI);
                }
            }
        }
    }
}
