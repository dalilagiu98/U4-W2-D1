import java.util.Random;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        int[] randomIntegerArray = getRandomInteger();
        boolean isDifferentFromZero = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, this is the array created:");
        printArray(randomIntegerArray);

        do {
            System.out.println("Please insert a integer different from 0 for the number you want to insert:");
            int newInteger = Integer.parseInt(scanner.nextLine());
            if(newInteger != 0) {
                System.out.println("Please insert a integer from 0 to 4 for the position of the number declared before:");
                int integerIndex = Integer.parseInt(scanner.nextLine());
                try {
                    randomIntegerArray[integerIndex] = newInteger;
                    printArray(randomIntegerArray);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println("Insert a valid number! (from 0 to 4)");
                }
            } else {
                isDifferentFromZero = false;
            }
        } while (isDifferentFromZero);

        scanner.close();
    }

    //METHOD FOR GENERATE A NEW ARRAY OF FIVE RANDOM INTEGERS FROM 1 TO 10 AND PRINT IT IN CONSOLE
    public static int[] getRandomInteger() {
        int[] integerArray = new int[5]; //I instantiate an array of five elements
        Random random = new Random();
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = random.nextInt(1,11);
        }
        return integerArray;
    }

    //METHOD TO PRINT ARRAY
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("value in position " + i + " element: " + array[i]);
        }
    }
}
