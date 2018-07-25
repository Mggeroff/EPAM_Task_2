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
        // Throws ArrayIndexOfBoundException
//        logger.info(Arrays.toString(sort.quickSort(numbers)));
        logger.info(Arrays.toString(sort.bubbleSort(numbersCopy)));
        logger.info(Arrays.toString(ArrayReverse.reverse(numbersCopy)));

        Palindrome palindromeCheck = new Palindrome();
        logger.info(palindromeCheck.checkPalindrome(numbers));
    }
}
