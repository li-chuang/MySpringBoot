package com.lichuang.utils.http;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

@Slf4j
public class HttpUtil {

    private final static String ENCODE = "GBK";

    public static String getResponseJson(int timeout, String url, String param) {
        try {
            URL posturl = new URL(url);
            HttpURLConnection jconn = (HttpURLConnection) posturl.openConnection();

            jconn.setConnectTimeout(1000 * timeout);
            jconn.setReadTimeout(1000 * timeout);
            jconn.setRequestProperty("Content-Length", param.length() + "");
//            jconn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
            jconn.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            jconn.setRequestMethod("POST");
            jconn.setDoOutput(true);
            jconn.setDoInput(true);

            OutputStream out = jconn.getOutputStream();
            out.write(param.getBytes("utf-8"));
            out.close();

            InputStreamReader isr = new InputStreamReader(jconn.getInputStream(), "utf-8");
            BufferedReader in = new BufferedReader(isr);

            String inputLine = null;
            StringBuffer sb = new StringBuffer();
            // 不断循环从通道中读取返回信息，直至读取为空
            while ((inputLine = in.readLine()) != null) {
                sb.append(inputLine);
            }
            isr.close();
            in.close();
            inputLine = sb.toString();
            return inputLine;
        } catch (Exception e) {
            log.error("发送 POST 请求出现异常!" , e);
            return "";
        }
    }

    public static String getResponseJsonJD(int timeout, String url, String param) {
        try {
            URL posturl = new URL(url);
            HttpURLConnection jconn = (HttpURLConnection) posturl.openConnection();

            jconn.setConnectTimeout(1000 * timeout);
            jconn.setReadTimeout(1000 * timeout);
            jconn.setRequestProperty("Content-Length", param.length() + "");
            jconn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=gbk");
//            jconn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
//            jconn.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            jconn.setRequestMethod("POST");
            jconn.setDoOutput(true);
            jconn.setDoInput(true);

            OutputStream out = jconn.getOutputStream();
            out.write(param.getBytes("utf-8"));
            out.close();

            InputStreamReader isr = new InputStreamReader(jconn.getInputStream(), "utf-8");
            BufferedReader in = new BufferedReader(isr);

            String inputLine = null;
            StringBuffer sb = new StringBuffer();
            // 不断循环从通道中读取返回信息，直至读取为空
            while ((inputLine = in.readLine()) != null) {
                sb.append(inputLine);
            }
            isr.close();
            in.close();
            inputLine = sb.toString();
            return inputLine;
        } catch (Exception e) {
            log.error("发送 POST 请求出现异常!" , e);
            return "";
        }
    }

    //url编码
    public static String getURLEncoderString(String str) {
        String result = "";
        if (null == str) {
            return "";
        }
        try {
            result = java.net.URLEncoder.encode(str, "UTF-8");
        } catch (Exception e) {
            log.error("异常信息" , e);
        }
        return result;
    }
}
