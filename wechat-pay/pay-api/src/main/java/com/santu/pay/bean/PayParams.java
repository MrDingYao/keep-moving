package com.santu.pay.bean;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author santu
 * @date 2020/12/14 21:18
 */
@Data
@Accessors(chain = true)
public class PayParams {

    /**
     * 公众账号ID：必填
     */
    private String appid;

    /**
     * 商户号：必填
     */
    private String mchId;

    /**
     * 设备号
     */
    private String deviceInfo;

    /**
     * 随机字符串：必填
     */
    private String nonceStr;

    /**
     * 签名：必填
     */
    private String sign;

    /**
     * 签名类型
     */
    private String signType;

    /**
     * 商品描述：必填
     */
    private String body;

    /**
     * 商品详情
     */
    private String detail;

    /**
     * 附加数据
     */
    private String attach;

    /**
     * 商户订单号：必填
     */
    private String outTradeNo;

    /**
     * 货币类型
     */
    private String feeType;

    /**
     * 总金额：必填
     */
    private Integer totalFee;

    /**
     * 终端IP：必填
     */
    private String spbillCreateIp;

    /**
     * 交易开始时间
     */
    private String timeStart;

    /**
     * 交易结束时间
     */
    private String timeExpire;

    /**
     * 商品标记
     */
    private String goodsTag;

    /**
     * 通知地址：必填
     */
    private String notifyUrl;

    /**
     * 交易类型：必填
     */
    private String tradeType;

    /**
     * 商品ID
     */
    private String productId;

    /**
     * 指定支付方式
     */
    private String limitPay;

    /**
     * 用户标识
     */
    private String openid;

    /**
     * 电子发票入口开放标识
     */
    private String receipt;

    /**
     * 场景信息：必填
     */
    private String sceneInfo;
}
