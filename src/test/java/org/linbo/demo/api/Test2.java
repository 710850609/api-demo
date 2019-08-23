package org.linbo.demo.api;

/**
 * @author LinBo
 * @date 2018-11-22 12:08
 */
public class Test2 {

    public static void main(String[] args) {
        String str = "<p>测试使<strong>用说</strong><span style=\"color: #008000;\">明</span></p>\n" +
                "<blockquote>\n" +
                "<ol>\n" +
                "<li><em>测试<span style=\"color: #33cccc;\">换</span>行 不测试林</em></li>\n" +
                "</ol>\n" +
                "</blockquote>";
        System.out.println(str);
        String[] chars = str.split("|");
        for (int i = 0; i<chars.length; i++) {
            String s = chars[i];
            if ("<".equals(s)) {
                int rightStart = findRightStart(chars, i);
                int leftEnd = findEnd(chars, i);
                String temp = str.substring(leftEnd + 1, rightStart);
                System.out.println(temp);
                i = findEnd(chars, rightStart) + 1;
            }
        }
    }

    private static int findEnd(String[] arr, int i) {
        while (i <= arr.length) {
            if (">".equals(arr[i])) {
                return i;
            }
            i++;
        }
        return arr.length;
    }

    private static int findRightStart(String[] arr, int i) {
        while (i <= arr.length) {
            if ("<".equals(arr[i]) && "/".equals(arr[i+1])) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
