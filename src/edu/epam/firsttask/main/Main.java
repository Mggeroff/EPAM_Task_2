package edu.epam.firsttask.main;

import edu.epam.firsttask.creator.ArrayCreator;
import edu.epam.firsttask.reader.ConsoleReader;
import edu.epam.firsttask.validator.StringFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Main {
    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        String[] strings = consoleReader.readStringArray(System.in);

        StringFilter filter = new StringFilter();
        String[] strNumbers = filter.filterInt(strings);

        ArrayCreator creator = new ArrayCreator();
        int[] numbers = creator.factoryArray(strNumbers);

        logger.info(Arrays.toString(numbers));
        Arrays.sort(numbers);
        logger.info(Arrays.toString(numbers));
    }
}
