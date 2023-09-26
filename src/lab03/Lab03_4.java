package lab03;

import java.util.Arrays;

public class Lab03_4 {
    public static void main(String[] args) {
        int[] myIntArr1 = {1, 12, 16, 28, 34};
        int[] myIntArr2 = {1, 13, 16, 27, 99};
        int[] mergedArr = new int[10];
        int index;
        int newIndex = 0;
        for (index = 0; index < myIntArr1.length; index++) {
            if (myIntArr1[index] <= myIntArr2[index]) {
                mergedArr[newIndex] = myIntArr1[index];
                mergedArr[newIndex + 1] = myIntArr2[index];
            } else {
                mergedArr[newIndex] = myIntArr2[index];
                mergedArr[newIndex + 1] = myIntArr1[index];
            }
            newIndex = newIndex + 2;
        }
        System.out.print("Expected output: ");
        System.out.print(Arrays.toString(mergedArr));
    }
}
