package Q2;

import java.lang.reflect.Array;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        // output: [1, 2, 3]
        int[][] arr2 = {{11, 12, 13}, {21, 22, 23}, {31, 32, 33}};
        // output: [[11, 12, 13], [21, 22, 23], [31, 32, 33]]
        ArrayUtils arrayUtils = new ArrayUtils();
        arrayUtils.printArray(arr1);
        arrayUtils.printArray(arr2);
    }

    public <T> void printArray(T array) {
        if (array.getClass().isArray()) {
            printArrayHelp(array);
        } else {
            System.out.println(array);
        }
        System.out.println();
    }

    private void printArrayHelp(Object array) {
        if (array.getClass().isArray()) {
            System.out.print("[");
            int length = Array.getLength(array);
            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                printArrayHelp(Array.get(array, i));
            }
            System.out.print("]");
        } else {
            System.out.print(array);
        }
    }
}
