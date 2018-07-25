package edu.epam.firsttask.sort;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortArray {
    private static Logger logger = LogManager.getLogger();

    public int[] quickSort(int[] array) {
        logger.info("*** Quick Sort ***");
        int length = array.length;

        if (length < 2) {
            return array;
        }
        qs(array, 0, length - 1);
        return array;
    }

    private void qs(int[] array, int low, int high) {
        if (array == null || array.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;
        int left = low;
        int right = high;
        int pivot = array[mid];

        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right++;
            }
        }

        if (low < right) {
            qs(array, low, right);
        }
        if (left < high) {
            qs(array, left, high);
        }
    }

    public int[] bubbleSort(int[] array) {
        logger.info("*** Bubble Sort ***");
        int length = array.length;
        if (length < 2) {
            return array;
        }
        for (int i = length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    public int[] reverse(int[] array) {
        int length = array.length;

        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
        return array;
    }
}
