package com.tezqa.android.utils;

import java.util.Iterator;
import java.util.Map;

/**
 * Author: Samir Moussouni | Tezqa
 * Email: sam@tezqa.com
 * www: http://www.tezqa.com
 */
public class PrettyPrintUtils<K, V> {

    /**
     * Pretty print a Map
     * @param map      Map to print more gracefully
     * @return          A pretty string ;)
     */
    public String prettyPrintMap(final Map<K, V> map) {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<K, V>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<K, V> entry = iter.next();
            sb.append(entry.getKey());
            sb.append('=').append('"');
            sb.append(entry.getValue());
            sb.append('"');
            if (iter.hasNext()) {
                sb.append(',').append(' ');
            }
        }
        return sb.toString();

    }

}
