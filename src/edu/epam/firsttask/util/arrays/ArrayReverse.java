package edu.epam.firsttask.util.arrays;

public class ArrayReverse {
    public static int[] reverse(int[] array) {
        int length = array.length;

        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
        return array;
    }
}
