package edu.epam.firsttask.util;

import edu.epam.firsttask.sort.SortArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Profiler {
    private static Logger logger = LogManager.getLogger();

    private int[] arrayOne;
    private int[] arrayTwo;
    private SortArray sort = new SortArray();

    public Profiler(int[] array) {
        this.arrayOne = Arrays.copyOf(array, array.length);
        this.arrayTwo = Arrays.copyOf(array, array.length);
    }

    public void measureQuickSort() {
        long startTimeQS = System.nanoTime();
        sort.quickSort(arrayOne);
        long stopTimeQS = System.nanoTime();

        long res = stopTimeQS - startTimeQS;

        logger.info("Measure QuickSort Performance: ");
        logger.info(res);
    }

    public void measureBubbleSort() {
        long startTimeBS = System.nanoTime();
        sort.bubbleSort(arrayTwo);
        long stopTimeBS = System.nanoTime();

        long res = stopTimeBS - startTimeBS;

        logger.info("Measure Bubble Sort Performance: ");
        logger.info(res);
    }
}
