package com.tezqa.android.utils;

/**
 * Author: Samir Moussouni | Tezqa
 * Email: sam@tezqa.com
 * www: http://www.tezqa.com
 */
public class StringUtils {

    /**
     * Remove all alpha characters from a string
     * @param str   String to parse
     * @return      Return a string without alpha characters, only numeric characters
     */
    public static String removeAlphaCharacters(String str) {
        return str.replaceAll("[^\\d.]", "");
    }

    /**
     * Join all array string elements into a string
     * @param arrayOfString     Array of string
     * @param delimiter         Delimiter
     * @return                  String value
     */
    public static String join(String[] arrayOfString, String delimiter) {
        String result = "";
        for (int i = 0; i < arrayOfString.length; i++) {
            result += arrayOfString[i];
            if (i < arrayOfString.length - 1) result += delimiter;
        }
        return result;
    }

}
