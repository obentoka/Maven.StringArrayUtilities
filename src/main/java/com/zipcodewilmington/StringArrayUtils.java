package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String ele : array){
            if(ele.equals(value)){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverseArray = new String[array.length];
        int k = 0;
        for(int i = array.length-1; i >= 0; i--){
            reverseArray[k] = array[i];
            if(k != array.length-1){
                k++;
            }
        }
        return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean isPali = false;
        String[] reverseArray = reverse(array);
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(reverseArray[i])){
                isPali = true;
            }else {
                isPali = false;
            }
        }
        return isPali;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean isPangramic = false;
        int isAll26 = 0;
        String checkArray = Arrays.toString(array).toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i < alphabet.length(); i++){
            for(int k = 0; k < checkArray.length(); k++){
                if(alphabet.charAt(i) == checkArray.charAt(k)){
                    isAll26++;
                    break;
                }
            }
        }
        if(isAll26 == 26){
            isPangramic = true;
        }
        return isPangramic;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurranceCounter = 0;
        String arrayCheck = "";
        for(int i = 0; i < array.length; i++){
            arrayCheck = array[i].replace(value, "1");
            for(int k = 0; k < arrayCheck.length(); k++){
                if(arrayCheck.charAt(0) == '1'){
                    occurranceCounter++;
                }
            }
        }
        return occurranceCounter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] newArray = new String[array.length-1];
        int newArrayCounter = 0;
        for(int i = 0; i < array.length; i++){
            if(!array[i].equals(valueToRemove)){
                newArray[newArrayCounter] = array[i];
                newArrayCounter++;
            }
        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String noDuplicateString = "";
        int occurance = 0;
        for(int i = 0; i < array.length-1; i++){
            if(!array[i].equals(array[i+1])){
                noDuplicateString += array[i] + " ";
            }
        }
        noDuplicateString += array[array.length-1];
        for(int i = 0; i < noDuplicateString.length(); i++){
            if(noDuplicateString.charAt(i) == ' ') {
                occurance++;
            }
        }

        occurance++;

        String[] newArray = noDuplicateString.split(" ", occurance);
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String arrayString = "";
        int occurance = 0;
        for(int i = 0; i < array.length-1; i++){
            if(array[i] != array[i+1]){
                arrayString += array[i] + " ";
            }else {
                arrayString += array[i];
            }
        }

        arrayString += array[array.length-1];

        for(int i = 0; i < arrayString.length(); i++){
            if(arrayString.charAt(i) == ' ') {
                occurance++;
            }
        }

        occurance++;

        String[] newArray = arrayString.split(" ", occurance);
        return newArray;
    }


}
