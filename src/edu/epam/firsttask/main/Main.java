package edu.epam.firsttask.main;

import edu.epam.firsttask.arrays.util.ArrayCreator;
import edu.epam.firsttask.arrays.util.ArrayReverse;
import edu.epam.firsttask.calc.Palindrome;
import edu.epam.firsttask.reader.ConsoleReader;
import edu.epam.firsttask.sort.SortArray;
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

        int[] sortedNums = sort.bubbleSort(numbers);
        logger.info(Arrays.toString(sortedNums));

        int[] reversedNums = ArrayReverse.reverse(numbers);
        logger.info(Arrays.toString(reversedNums));

        Palindrome palindrome = new Palindrome();
        logger.info(palindrome.checkPalindrome(numbers));
        logger.info(palindrome.checkPalindrome(reversedNums));
    }
}
