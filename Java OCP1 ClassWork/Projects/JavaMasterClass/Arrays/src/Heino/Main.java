package Heino;

public class Main {

    public static void main(String[] args) {
        int[] myIntArray = new int[25];//{1,2,3,4,5,6,7,8,9,10};
//        myIntArray[0] = 45;
//        myIntArray[1] = 476;
//        myIntArray[5] = 50;
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }

    }
}
