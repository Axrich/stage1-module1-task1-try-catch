package com.epam.m1.exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Complete the code, parse integers, calculate the sum of numbers in the WORDS, join strings with
 * space delimiter
 */
public class ParseIntegers {

    private static final List<String> WORDS = Arrays.asList(
            "JDK 17 has released on 14 September 2021 with 10 new features, 2 feature removals and 2 feature deprecations."
                    .split(" "));

    public static void main(String[] args) {
        int sum = 0;
        StringBuilder justWords = new StringBuilder();

        for (String word : WORDS) {
            try {
                int number = Integer.parseInt(word);
                sum += number;
            } catch (NumberFormatException e) {
                // Append non-numeric words to justWords with a space delimiter
                justWords.append(word).append(" ");
            }
        }

        // Trim any trailing space from justWords
        String justWordsString = justWords.toString().trim();

        System.out.println("Sum is " + sum);
        System.out.println("Just words: " + justWordsString);
    }
}
