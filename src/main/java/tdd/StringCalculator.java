/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oleksii_Prokopenko
 */
public class StringCalculator {

    public static int add(final String numbers) {
        String delimiter = ",|n"; // Added |n to the split regex
        String numbersWithoutDelimiter = numbers;
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("//") + 2;
            delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
            numbersWithoutDelimiter = numbers.substring(numbers.indexOf("n") + 1);
        }
        return add(numbersWithoutDelimiter, delimiter);
    }

    public static final int add(final String numbers, final String delimiter) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(delimiter);
//        if (numbersArray.length > 2) {
//            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
//        } else {
//        for (String number : numbersArray) {
//            //Integer.parseInt(number); // If it is not a number, parseInt will throw an exception
//            if (!number.trim().isEmpty()) { // After refactoring
//                returnValue += Integer.parseInt(number);
//            }
//        }

        List negativeNumbers = new ArrayList();
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                int numberInt = Integer.parseInt(number.trim());
                if (numberInt < 0) {
                    negativeNumbers.add(numberInt);
                }
                returnValue += numberInt;
            }
        }
        if (negativeNumbers.size() > 0) {
            throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
        }
        //  }
        //return Integer.parseInt(numbersArray[1]) + Integer.parseInt(numbersArray [0]);
        return returnValue;
    }

}
