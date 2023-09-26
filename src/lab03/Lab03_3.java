package lab03;

import java.util.Arrays;

public class Lab03_3 {
    public static void main(String[] args) {
        int[] myIntArr = new int[]{99, 34, 16, 12, 1};
        int min;
        int outIndex;
        for (outIndex = 0; outIndex < myIntArr.length - 1; outIndex++) {
            if (myIntArr[outIndex] > myIntArr[outIndex + 1]) {
                min = myIntArr[outIndex + 1];
                myIntArr[outIndex + 1] = myIntArr[outIndex];
                myIntArr[outIndex] = min;
            }
            for (int inIndex = 0; inIndex < myIntArr.length - 1; inIndex++) {
                if (myIntArr[inIndex] > myIntArr[inIndex + 1]) {
                    min = myIntArr[inIndex + 1];
                    myIntArr[inIndex + 1] = myIntArr[inIndex];
                    myIntArr[inIndex] = min;
                }

            }
        }
        System.out.print("Expected output: ");
        System.out.print(Arrays.toString(myIntArr));
    }
}