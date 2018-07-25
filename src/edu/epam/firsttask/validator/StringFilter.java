package edu.epam.firsttask.validator;

public class StringFilter {

    private static final String REGEX_DIGITS = "[-]?\\d+";

    public String[] filterInt(String[] numbers) {
        int counter = 0;
        for (String numberStr : numbers) {
            if (numberStr.matches(REGEX_DIGITS)) {
                counter++;
            }
        }

        String[] validStr = new String[counter];

        int i = 0;
        for (String numberStr : numbers) {
            if (numberStr.matches(REGEX_DIGITS)) {
                validStr[i++] = numberStr;
            }
        }

        return validStr;
    }
}
