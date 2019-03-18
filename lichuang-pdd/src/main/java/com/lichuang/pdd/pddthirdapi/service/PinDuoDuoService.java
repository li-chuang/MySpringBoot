package com.lichuang.pdd.pddthirdapi.service;

/**
 * Created by Administrator on 2019/3/18.
 */
public interface PinDuoDuoService {

    /**
     * pdd.ddk.goods.recommend.get （运营频道商品查询API）运营频道商品查询
     * @param channelType 频道类型；0, "1.9包邮", 1, "今日爆款", 2, "品牌清仓", 3, "默认商城", 非必填 ,默认是1
     * @param pid  推广位id
     * @return
     */
    String getGoodsRecommendGet(String channelType, String pid);

    // pdd.ddk.resource.url.gen

    /**
     * pdd.ddk.resource.url.gen （生成多多进宝频道推广）生成拼多多主站频道推广
     * @param pid  推广位
     * @param resourceType 频道来源：4-限时秒杀,39997-充值中心, 39998-转链type，39999-电器城
     * @param url  原链接( 非必填)
     * @return
     */
    String getResourceUrlGen(String pid, String resourceType, String url);

    /**
     * pdd.ddk.rp.prom.url.generate （生成红包推广链接）生成红包推广链接接口
     * @param pidList  推广位列表，例如：["60005_612"]
     * @param generateWeAppWebView 是否唤起微信客户端， 默认false 否，true 是
     * @param generateShortUrl  是否生成短链接。true-是，false-否，默认false
     * @param weAppWebViewShortUrl  唤起微信app推广短链接
     * @param weAppWebViewUrl  唤起微信app推广链接
     * @param generateWeApp  是否生成小程序推广
     * @return
     */
    String getRpPromUrlGenerate(String[] pidList, Boolean generateWeAppWebView, Boolean generateShortUrl, Boolean weAppWebViewShortUrl,
                                Boolean weAppWebViewUrl, Boolean generateWeApp);


    /**
     * pdd.ddk.merchant.list.get （多多客查店铺列表接口）多多客查店铺列表接口
     * @param hasCoupon 是否有优惠券 （0 所有；1 必须有券。）
     * @return
     */
    String getMerchantListGet(String hasCoupon);

    /**
     * pdd.ddk.top.goods.list.query （多多客获取爆款排行商品接口）获取热销商品列表
     * @return
     */
    String getTopGoodsListQuery();
}
