package lab03;

public class Lab03_1 {
    public static void main(String[] args){
        int[] myIntArr = new int[] {1, 2, 3, 4, 5};
        int countEvenNum = 0;
        int countOddNum = 0;
        for (int index = 0; index < myIntArr.length; index++ ){
            if (myIntArr[index] % 2 == 0) {
                countEvenNum++;
            } else {
                countOddNum++;
            }
        }
        System.out.format("Even numbers: %d\n", countEvenNum);
        System.out.format("Odd numbers: %d\n", countOddNum);
    }
}
