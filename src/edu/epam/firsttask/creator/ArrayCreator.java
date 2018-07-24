package edu.epam.firsttask.creator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayCreator {
    private static Logger logger = LogManager.getLogger();

    public int[] factoryArray(String[] values) {
        int[] result = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            result[i] = Integer.parseInt(values[i]);
        }

        return result;
    }
}
