package org.linbo.demo.api;

/**
 * @author LinBo
 * @date 2018-11-22 12:42
 */
public class Test3 {

    public static void main(String[] args) {
        String str = "<p>测试使<strong>用说</strong><span style=\"color: #008000;\">明</span></p>\n" +
                "<blockquote>\n" +
                "<ol>\n" +
                "<li><em>测试<span style=\"color: #33cccc;\">换</span>行 不测试林</em></li>\n" +
                "</ol>\n" +
                "</blockquote>";
        System.out.println(str);

        str = str.replaceAll("<(\\w+)[\\s\\w=;:\"-#]*>", "");
        System.out.println("---" + str);

        str = str.replaceAll("</(\\w+)[\\s\\w=;:\"-#]*>", "");
        System.out.println("===" + str);
    }
}
