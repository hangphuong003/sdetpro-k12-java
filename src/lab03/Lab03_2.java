package lab03;

public class Lab03_2 {
    public static void main(String[] args) {
        int[] myIntArr = new int[] {1, 2, 3, 4, 5};
        int min = myIntArr[0];
        int max = myIntArr[0];
        for (int index = 1; index < myIntArr.length; index++ ){
            if (myIntArr[index] < min) {
                min = myIntArr[index];
            } else {
                if (myIntArr[index] > max) {
                    max = myIntArr[index];
                }
            }
        }
        System.out.format("Minimum: %d\n", min);
        System.out.format("Maximum: %d\n", max);
    }
}
