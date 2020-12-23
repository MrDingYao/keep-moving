package com.santu.pay.api;

import com.santu.pay.bean.PayParams;

/**
 * @author santu
 * @date 2020/12/14 21:04
 */
public interface WeChatPayApi {

    /**
     * 统一下单
     */
    void unifiedOrder(PayParams payParams);

    /**
     * 查询订单
     */
    void orderQuery(PayParams payParams);

    /**
     * 关闭订单
     */
    void closeOrder();
}
