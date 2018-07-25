package edu.epam.firsttask.reader;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.InputStream;
import java.util.Scanner;

public class ConsoleReader {
    private static final String REGEX_DELIMITER = "\\s+";
    private static Logger logger = LogManager.getLogger();

    public String[] readStringArray(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream);

        logger.log(Level.INFO, "Enter numbers, separated by space. To finish press enter.");
        String input = scanner.nextLine();

        String[] stringArray = input.trim().split(REGEX_DELIMITER);
        return stringArray;
    }
}
