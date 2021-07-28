package com.aixue.str;

public class ReplaceSpace {

//请实现一个函数，把字符串S中的每一个空格口替换成“%20”；
    public static String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (" ".equals(String.valueOf(str.charAt(i)))) {

                sb.append("%20");

            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}
