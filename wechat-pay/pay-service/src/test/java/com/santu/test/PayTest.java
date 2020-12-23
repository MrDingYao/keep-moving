package com.santu.test;

import cn.hutool.core.util.RandomUtil;
import com.santu.pay.WeChatPayApplication;
import com.santu.pay.bean.PayParams;
import com.santu.pay.service.WeChatPayServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author santu
 * @date 2020/12/14 21:55
 */
@SpringBootTest(classes = WeChatPayApplication.class)
@RunWith(SpringRunner.class)
public class PayTest {

    @Autowired
    private WeChatPayServiceImpl payService;

    private static final String BASE_CHAR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Test
    void name() {
        PayParams payParams = new PayParams().setAppid("wxd678efh567hg6787")
                .setMchId("1230000109")
                .setNonceStr(RandomUtil.randomString(BASE_CHAR, 16))
                .setBody("腾讯充值中心-QQ会员充值")
                .setOutTradeNo("20201214125346")
                .setTotalFee(1)
                .setSpbillCreateIp("123.12.12.123")
                .setNotifyUrl("http://www.weixin.qq.com/wxpay/pay.php")
                .setTradeType("MWEB")
                .setSceneInfo("{\"h5_info\": {\"type\":\"Wap\",\"wap_url\": \"https://pay.qq.com\",\"wap_name\": \"腾讯充值\"}}");
        payService.unifiedOrder(payParams);
    }
}
