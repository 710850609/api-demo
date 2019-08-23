package org.linbo.demo.api;

/**
 * @author LinBo
 * @date 2018-11-19 15:54
 */
public class Test {

    public static void main(String[] args) {
        String url = "http://192.168.0.20:20000/controller/downloadfile.shtml?deviceid=496146cb-3c1d-43ca-ba1b-4637d6b67a42&amp;allorpart=1&amp;otafirmware=1.1";
        String domain = "www.google.com";

        String[] arr = url.split("/");
        String[] host = arr[2].split(":");
        StringBuilder buf = new StringBuilder(arr[0]);
        buf.append("//").append(domain);
        if (host.length > 1) {
            buf.append(":").append(host[1]);
        }
        for (int i=3; i<arr.length; i++) {
            buf.append("/").append(arr[i]);
        }
        url = buf.toString();
        System.out.println(url);
    }


}
