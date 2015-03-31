package com.tezqa.android.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Author: Samir Moussouni | Tezqa
 * Email: sam@tezqa.com
 * www: http://www.tezqa.com
 */
public class EncryptionUtils {

    /**
     * Convert a String to its MD5 String representation
     * @param str   String to convert
     * @return      MD5 string
     */
    public static String md5(String str) {
        try {
            // Create MD5 Hash
            MessageDigest digest = java.security.MessageDigest.getInstance("MD5");
            digest.update(str.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuffer hexString = new StringBuffer();
            for (int i=0; i<messageDigest.length; i++)
                hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
}
