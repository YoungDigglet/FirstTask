package org.tMobile.utils;

import java.util.HashMap;
import java.util.Map;

public class GetPriceUtil {
    private static final Map<String, String> map = new HashMap<>();

    public static void setPriceBetweenView(String key, String value) {
        map.put(key, value);
    }

    public static String getPriceBetweenView(String key) {
        return map.get(key);
    }

}
