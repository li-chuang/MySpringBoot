package com.lichuang.pdd.pddthirdapi.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lichuang.constant.pdd.PinDuoDuoAPI;
import com.lichuang.constant.pdd.PinDuoDuoConstant;
import com.lichuang.pdd.pddthirdapi.service.PinDuoDuoService;
import com.lichuang.utils.http.HttpUtil;
import com.lichuang.utils.md5.MD5Helper;
import com.lichuang.utils.thirdapi.SortParamUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/3/18.
 */
@Service
@Slf4j
public class PinDuoDuoServiceImpl implements PinDuoDuoService{

    public String getGoodsRecommendGet(String channelType, String pid){
        long date = new Date().getTime();// 时间戳

        Map<String ,String> apiParams = new HashMap<>();
        apiParams.put("client_id", PinDuoDuoConstant.PDD_CLIENT_ID);
        apiParams.put("data_type", "JSON");
        apiParams.put("timestamp", date + "");
        apiParams.put("type", PinDuoDuoAPI.PDD_DDK_GOODS_RECOMMEND_GET);
        apiParams.put("channel_type", channelType);
        apiParams.put("pid", pid);

        String sortedSignContent = SortParamUtil.getSignContent(apiParams);  //转化为字符串
        String md5 = MD5Helper.md5Hex(PinDuoDuoConstant.PDD_SECRET + sortedSignContent + PinDuoDuoConstant.PDD_SECRET, "").toUpperCase();

        apiParams.put("sign", md5);
        JSONObject jsonString = JSONObject.parseObject(JSON.toJSONString(apiParams));

        String result = HttpUtil.getResponseJson(20, PinDuoDuoConstant.PDD_URL , jsonString.toString());
        if(result!=null && result.contains("error_response")){
            log.error("运营频道商品查询异常 {} {}",jsonString.toString(), result);
        }
        log.info("pdd.ddk.goods.recommend.get.result = {}", result);
        return result;
    }

    public String getResourceUrlGen(String pid, String resourceType, String url){
        long date = new Date().getTime();// 时间戳

        Map<String ,String> apiParams = new HashMap<>();
        apiParams.put("client_id", PinDuoDuoConstant.PDD_CLIENT_ID);
        apiParams.put("data_type", "JSON");
        apiParams.put("timestamp", date + "");
        apiParams.put("type", PinDuoDuoAPI.PDD_DDK_RESOURCE_URL_GEN);
        apiParams.put("resource_type", resourceType);
        apiParams.put("pid", pid);
        apiParams.put("url", url);

        String sortedSignContent = SortParamUtil.getSignContent(apiParams);  //转化为字符串
        String md5 = MD5Helper.md5Hex(PinDuoDuoConstant.PDD_SECRET + sortedSignContent + PinDuoDuoConstant.PDD_SECRET, "").toUpperCase();

        apiParams.put("sign", md5);
        JSONObject jsonString = JSONObject.parseObject(JSON.toJSONString(apiParams));

        String result = HttpUtil.getResponseJson(20, PinDuoDuoConstant.PDD_URL , jsonString.toString());
        if(result!=null && result.contains("error_response")){
            log.error("生成多多进宝频道推广异常 {} {}",jsonString.toString(), result);
        }
        log.info("pdd.ddk.resource.url.gen.result = {}", result);
        return result;
    }

    public String getRpPromUrlGenerate(String[] pidList, Boolean generateWeAppWebView, Boolean generateShortUrl, Boolean weAppWebViewShortUrl,
                                       Boolean weAppWebViewUrl, Boolean generateWeApp){
        long date = new Date().getTime();// 时间戳
        StringBuilder sb = new StringBuilder();
        for (String pid : pidList){
            sb.append("\"");
            sb.append(pid);
            sb.append("\",");
        }
        String str = sb.substring(0, sb.length()-1);
        System.out.println("[" + str + "]");

        Map<String ,String> apiParams = new HashMap<>();
        apiParams.put("client_id", PinDuoDuoConstant.PDD_CLIENT_ID);
        apiParams.put("data_type", "JSON");
        apiParams.put("timestamp", date + "");
        apiParams.put("type", PinDuoDuoAPI.PDD_DDK_RP_PROM_URL_GENERATE);
        apiParams.put("p_id_list", "[" + str + "]");
        apiParams.put("generate_weapp_webview", generateWeAppWebView.toString());
        apiParams.put("generate_short_url", generateShortUrl.toString());
        apiParams.put("we_app_web_view_short_url", weAppWebViewShortUrl.toString());
        apiParams.put("we_app_web_wiew_url", weAppWebViewUrl.toString());
        apiParams.put("generate_we_app", generateWeApp.toString());

        String sortedSignContent = SortParamUtil.getSignContent(apiParams);  //转化为字符串
        String md5 = MD5Helper.md5Hex(PinDuoDuoConstant.PDD_SECRET + sortedSignContent + PinDuoDuoConstant.PDD_SECRET, "").toUpperCase();

        apiParams.put("sign", md5);
        JSONObject jsonString = JSONObject.parseObject(JSON.toJSONString(apiParams));

        String result = HttpUtil.getResponseJson(20, PinDuoDuoConstant.PDD_URL , jsonString.toString());
        if(result!=null && result.contains("error_response")){
            log.error("生成红包推广链接接口异常 {} {}",jsonString.toString(), result);
        }
        log.info("pdd.ddk.rp.prom.url.generate.result = {}", result);
        return result;
    }

    public String getMerchantListGet(String hasCoupon){
        long date = new Date().getTime();// 时间戳

        Map<String ,String> apiParams = new HashMap<>();
        apiParams.put("client_id", PinDuoDuoConstant.PDD_CLIENT_ID);
        apiParams.put("data_type", "JSON");
        apiParams.put("timestamp", date + "");
        apiParams.put("type", PinDuoDuoAPI.PDD_DDK_MERCHANT_LIST_GET);
        apiParams.put("has_coupon", hasCoupon);

        String sortedSignContent = SortParamUtil.getSignContent(apiParams);  //转化为字符串
        String md5 = MD5Helper.md5Hex(PinDuoDuoConstant.PDD_SECRET + sortedSignContent + PinDuoDuoConstant.PDD_SECRET, "").toUpperCase();

        apiParams.put("sign", md5);
        JSONObject jsonString = JSONObject.parseObject(JSON.toJSONString(apiParams));

        String result = HttpUtil.getResponseJson(20, PinDuoDuoConstant.PDD_URL , jsonString.toString());
        if(result!=null && result.contains("error_response")){
            log.error("多多客查店铺列表接口异常 {} {}",jsonString.toString(), result);
        }
        log.info("pdd.ddk.merchant.list.get.result = {}", result);
        return result;
    }

    public String getTopGoodsListQuery(){
        long date = new Date().getTime();// 时间戳

        Map<String ,String> apiParams = new HashMap<>();
        apiParams.put("client_id", PinDuoDuoConstant.PDD_CLIENT_ID);
        apiParams.put("data_type", "JSON");
        apiParams.put("timestamp", date + "");
        apiParams.put("type", PinDuoDuoAPI.PDD_DDK_TOP_GOODS_LIST_QUERY);

        String sortedSignContent = SortParamUtil.getSignContent(apiParams);  //转化为字符串
        String md5 = MD5Helper.md5Hex(PinDuoDuoConstant.PDD_SECRET + sortedSignContent + PinDuoDuoConstant.PDD_SECRET, "").toUpperCase();

        apiParams.put("sign", md5);
        JSONObject jsonString = JSONObject.parseObject(JSON.toJSONString(apiParams));

        String result = HttpUtil.getResponseJson(20, PinDuoDuoConstant.PDD_URL , jsonString.toString());
        if(result!=null && result.contains("error_response")){
            log.error("获取热销商品列表异常 {} {}",jsonString.toString(), result);
        }
        log.info("pdd.ddk.top.goods.list.query.result = {}", result);
        return result;
    }

    public static void main(String[] args){
        PinDuoDuoServiceImpl impl = new PinDuoDuoServiceImpl();
        // 今日爆款 channel_type=1
        // 1块9包邮 channel_type=0
        // 品牌清仓 channel_type=2
        //String result = impl.getGoodsRecommendGet("2", PinDuoDuoConstant.PDD_PID);
        // 限时秒杀 resource_type=4
        //String result = impl.getResourceUrlGen(PinDuoDuoConstant.PDD_PID, "4", "https://mobile.yangkeduo.com/goods2.html?goods_id=4341414576");
        // 多多红包
//        String[] arrays = new String[]{PinDuoDuoConstant.PDD_PID};
//        String result = impl.getRpPromUrlGenerate(arrays, true, true, true,
//                true, true);
        // 优质店铺
        //String result = impl.getMerchantListGet("0");
        String result = impl.getTopGoodsListQuery();
        System.out.print(result);
    }


}
