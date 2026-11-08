public class Main{
    public static void main(String[] args){
        StaticArray staticArray = new StaticArray();
        // insert End method
        int[] arrayOne = new int[4];
        arrayOne[0] = 1;
        arrayOne[1] = 2;
        arrayOne[2] = 3;

        arrayOne = staticArray.insertEnd(arrayOne, 9, 3, 4);
        // System.out.println(arrayOne[2]);

        // remove End method
        int[] arrayTwo = new int[4];
        arrayTwo[0] = 1;
        arrayTwo[1] = 2;
        arrayTwo[2] = 3;
        arrayTwo[3] = 4;

        arrayTwo = staticArray.removeEnd(arrayTwo, 4);
        // System.out.println(arrayTwo[0]);
        // System.out.println(arrayTwo[1]);
        // System.out.println(arrayTwo[2]);
        // System.out.println(arrayTwo[3]);

        // insertAtIndex method
        int[] arrayThree = new int[4];

        arrayThree[0] = 1;
        arrayThree[1] = 2;
        arrayThree[2] = 3;

        arrayThree = staticArray.insertAtMiddle(arrayThree, 9, 2, 3,4);
        System.out.println(arrayThree[0]);
        System.out.println(arrayThree[1]);
        System.out.println(arrayThree[2]);
        System.out.println(arrayThree[3]);

        // removeAtIndex method
        int[] arrayFour = new int[6];

        arrayFour[0] = 1;
        arrayFour[1] = 2;
        arrayFour[2] = 3;
        arrayFour[3] = 4;
        arrayFour[4] = 5;
        arrayFour[5] = 6;

        arrayFour = staticArray.removeAtIndex(arrayFour, 2, 6);
        // System.out.println(arrayFour[0]);
        // System.out.println(arrayFour[1]);
        // System.out.println(arrayFour[2]);
        // System.out.println(arrayFour[3]);
        // System.out.println(arrayFour[4]);
        // System.out.println(arrayFour[5]);
    }
}