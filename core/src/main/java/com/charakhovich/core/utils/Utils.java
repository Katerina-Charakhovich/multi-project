package com.charakhovich.core.utils;
import com.charakhovich.utils.StringUtils;

import java.util.stream.Stream;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        return Stream.of(str).allMatch(StringUtils::isPositiveNumber);
    }
}
