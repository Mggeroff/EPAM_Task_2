package edu.epam.firsttask.main;

import edu.epam.firsttask.reader.ConsoleReader;
import edu.epam.firsttask.sort.SortArray;
import edu.epam.firsttask.util.arrays.IntegerArrayCreator;
import edu.epam.firsttask.validator.StringFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {
    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws FileNotFoundException {
        ConsoleReader consoleReader = new ConsoleReader();
        StringFilter filter = new StringFilter();
        IntegerArrayCreator creator = new IntegerArrayCreator();
        SortArray sort = new SortArray();

        // READING FROM CONSOLE
//        String[] strings = consoleReader.readStringArray(System.in);
//        String[] strNumbers = filter.filterInt(strings);
//
//        int[] numbers = creator.factoryArray(strNumbers);
//        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
//
//        logger.info(Arrays.toString(numbers));
//
//        int[] sortedNums = sort.quickSort(numbers);
//        logger.info(Arrays.toString(sortedNums));
//
//        int[] reversedNums = ArrayReverse.reverse(numbers);
//        logger.info("reversed array: ");
//        logger.info(Arrays.toString(reversedNums));
//
//        logger.info(Arrays.toString(sort.bubbleSort(numbersCopy)));
//
//        Palindrome palindrome = new Palindrome();
//        logger.info(palindrome.checkPalindrome(numbers));
//
//        Profiler profiler = new Profiler(numbers);
//
//        profiler.measureQuickSort();
//        profiler.measureBubbleSort();

        // READING FROM FILE
        String[] dataFromFile = consoleReader.readStringArray(new FileInputStream(new File("info/data.txt")));
        String[] filteredDataFromFile = filter.filterInt(dataFromFile);
        int[] numArrayFromFile = creator.factoryArray(filteredDataFromFile);
        logger.info(Arrays.toString(numArrayFromFile));
        logger.info(Arrays.toString(sort.bubbleSort(numArrayFromFile)));

    }
}
