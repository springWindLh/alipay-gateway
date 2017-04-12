package com.lh.gateway.service;

import com.alipay.api.AlipayApiException;
import com.lh.gateway.model.alipay.AlipayPrecreateBizObject;
import com.lh.gateway.model.alipay.AlipayWapBizObject;

/**
 * Created by lh on 2017/4/11.
 */
public interface IAlipayService {
    /**
     * 构造网页支付表单
     *
     * @param bizObject
     * @return
     */
    String buildWapPayForm(AlipayWapBizObject bizObject) throws AlipayApiException;

    /**
     * 生成二维码支付地址
     *
     * @param bizObject
     * @return
     * @throws AlipayApiException
     */
    String buildQrCode(AlipayPrecreateBizObject bizObject) throws AlipayApiException;
}
