package lab02;
import java.util.Scanner;
public class Lab02_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter number:");
            int userInputNum = scanner.nextInt();
            boolean oddNum = userInputNum % 2 == 1;
            if (oddNum) {
                System.out.format("%d is odd number\n",userInputNum);
            } else {
                System.out.format("%d is even number\n",userInputNum);
            }
        }
        }
