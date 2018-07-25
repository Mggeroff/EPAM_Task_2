package edu.epam.firsttask.main;

import edu.epam.firsttask.calc.Palindrome;
import edu.epam.firsttask.reader.ConsoleReader;
import edu.epam.firsttask.sort.SortArray;
import edu.epam.firsttask.util.Profiler;
import edu.epam.firsttask.util.arrays.ArrayCreator;
import edu.epam.firsttask.util.arrays.ArrayReverse;
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
        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);

        logger.info(Arrays.toString(numbers));

        SortArray sort = new SortArray();

        int[] sortedNums = sort.quickSort(numbers);
        logger.info(Arrays.toString(sortedNums));

        int[] reversedNums = ArrayReverse.reverse(numbers);
        logger.info("reversed array: ");
        logger.info(Arrays.toString(reversedNums));

        logger.info(Arrays.toString(sort.bubbleSort(numbersCopy)));

        Palindrome palindrome = new Palindrome();
        logger.info(palindrome.checkPalindrome(numbers));

        Profiler profiler = new Profiler(numbers);

        profiler.measureQuickSort();
        profiler.measureBubbleSort();
    }
}
