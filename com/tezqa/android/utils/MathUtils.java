package com.tezqa.android.utils;

/**
 * Author: Samir Moussouni | Tezqa
 * Email: sam@tezqa.com
 * www: http://www.tezqa.com
 */
public class MathUtils {

    /**
     * Round a float number to half
     * @param x     Number to round
     * @return      Rounded value
     */
    public static float roundToHalf(float x) {
        return (float) (Math.ceil(x * 2) / 2);
    }

}
