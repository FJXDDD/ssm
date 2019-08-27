package com.zking.ssm.sys;

import com.zking.ssm.sys.util.HttpUtils;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

public class Sms {

    public static void main(String[] args) {
        String host = "http://cowsms.market.alicloudapi.com";
        String path = "/intf/smsapi";
        String method = "GET";
        String appcode = "8f4235b57407465bb1738780c0a72a79";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("mobile", "17375800424");
        querys.put("msg", "这也不显示我也不知道干啥的");
        querys.put("paras", "ssm冲冲冲,2!");
        querys.put("sign", "马化腾黄色中心");
        querys.put("tpid", "009");


        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            System.out.println(response.toString());
            //获取response的body
            System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
