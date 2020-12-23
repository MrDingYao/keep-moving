package com.santu.pay.service;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.XmlUtil;
import cn.hutool.crypto.digest.MD5;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.santu.pay.api.WeChatPayApi;
import com.santu.pay.bean.PayParams;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * @author santu
 * @date 2020/12/14 21:13
 */
@Service
public class WeChatPayServiceImpl implements WeChatPayApi {

    private static final String BASE_CHAR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static final String PLATFORM_KEY = "192006250b4c09247ec02edce69f6a2d";

    private static final String UNIFIED_ORDER_URL = "https://api.mch.weixin.qq.com/pay/unifiedorder";

    private static final String ORDER_QUERY = "https://api.mch.weixin.qq.com/pay/orderquery";

    @Override
    public void unifiedOrder(PayParams payParams) {
        Map<String, Object> paramsMap = BeanUtil.beanToMap(payParams, true, true);
        String sign = generateSign(paramsMap);
        paramsMap.put("sign", sign);
        System.out.println(paramsMap);
        String xmlData = XmlUtil.mapToXmlStr(paramsMap);
        HttpResponse httpResponse = HttpUtil.createPost(UNIFIED_ORDER_URL).body(xmlData).execute();
        if (httpResponse.isOk()) {
            System.out.println("调用api成功：");
        } else {
            System.out.println("调用api失败：");
        }
        System.out.println(httpResponse.body());
    }

    @Override
    public void orderQuery(PayParams payParams) {
        Map<String, Object> paramsMap = BeanUtil.beanToMap(payParams, true, true);
        String sign = generateSign(paramsMap);
        paramsMap.put("sign", sign);
        System.out.println(paramsMap);

    }

    @Override
    public void closeOrder() {

    }

    private String generateSign(Map<String, Object> paramsMap) {
        TreeMap<String, Object> treeMap = new TreeMap<>(paramsMap);
        String dataString = treeMap.entrySet().stream().map(e -> e.getKey() + "=" + e.getValue()).collect(Collectors.joining("&"));
        dataString = dataString + "&key=" + PLATFORM_KEY;
        return MD5.create().digestHex(dataString).toUpperCase();
    }
}
