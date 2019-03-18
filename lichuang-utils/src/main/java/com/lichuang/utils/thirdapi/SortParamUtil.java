package com.lichuang.utils.thirdapi;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by Lich on 2018/12/6.
 */
@Slf4j
public class SortParamUtil {

    public static String getSignContent(Map<String, String> sortedParams) {
        StringBuffer content = new StringBuffer();
        List<String> keys = new ArrayList<String>(sortedParams.keySet());
        Collections.sort(keys);
        int index = 0;
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = sortedParams.get(key);
            if (areNotEmpty(key, value)) {
                content.append(key + "" + value);
                index++;
            }
        }
        return content.toString();
    }

    public static String getParamContent(Map<String, String> sortedParams) {
        StringBuffer content = new StringBuffer();
        List<String> keys = new ArrayList<String>(sortedParams.keySet());
        Collections.sort(keys);
        int index = 0;
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = sortedParams.get(key);
            if (areNotEmpty(key, value)) {
                content.append((index == 0 ? "" : "&") + key + "=" + value);
                index++;
            }
        }
        return content.toString();
    }

    public static boolean areNotEmpty(String... values) {
        boolean result = true;
        if (values == null || values.length == 0) {
            result = false;
        } else {
            for (String value : values) {
                result &= !isEmpty(value);
            }
        }
        return result;
    }

    public static boolean isEmpty(String value) {
        int strLen;
        if (value == null || (strLen = value.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if ((Character.isWhitespace(value.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }
/*

    public static Integer extractNumber(String str) {
        Integer result = 0;
        if(!StringUtil.isEmpty(str)) {
            if (str.startsWith("满")) {
                result = getRegexInteger(str, "减(.+)元");
            } else if (str.endsWith("无条件券")) {
                result = getRegexInteger(str, "(.+)元");
            }
        }
        return result;
    }
*/

/*    public static Integer getRegexInteger(String str,  String regex) {
        int result = 0;
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(str);
        while (matcher.find()) {
            int g = matcher.groupCount();
            for (int i = 1; i <= g; i++) {
                if (matcher.group(i) != null && matcher.group(i).trim().length() > 0) {
                    String num = matcher.group(i);
                    if (num != null && num.contains(".")) {
                        num = num.split("\\.")[0];
                    }
                    result = Integer.valueOf(num);
                }
            }
        }
        return result;
    }*/
}
