package edu.epam.firsttask.util.arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayCreator {
    private static Logger logger = LogManager.getLogger();

    public int[] factoryArray(String[] values) {
        int[] numbers = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            numbers[i] = Integer.parseInt(values[i]);
        }

        return numbers;
    }
}
