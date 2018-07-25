package edu.epam.firsttask.calc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Palindrome {
    private static Logger logger = LogManager.getLogger();

    private boolean isPalindrome(int number) {
        String str = Integer.toString(number);
        int length = str.length();

        if (length < 2) {
            return false;
        }

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public int checkPalindrome(int[] numbers) {
        logger.info("*** Checking if number is palindrome ***");
        int counter = 0;
        for (int number : numbers) {
            if (isPalindrome(number)) {
                counter++;
            }
        }

        int[] palindromes = new int[counter];

        int i = 0;
        for (int number : numbers) {
            if (isPalindrome(number)) {
                palindromes[i++] = number;
            }
        }

        if (palindromes.length == 0) {
            logger.info("PALINDROME IS NOT FOUND.");
            return 0;
        } else if (palindromes.length > 1) {
            return palindromes[1];
        } else {
            return palindromes[0];
        }
    }
}
