package com.lh.gateway.service.impl;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePrecreateRequest;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.alipay.api.response.AlipayTradePrecreateResponse;
import com.lh.gateway.config.AlipayConfig;
import com.lh.gateway.model.alipay.AlipayPrecreateBizObject;
import com.lh.gateway.model.alipay.AlipayWapBizObject;
import com.lh.gateway.service.IAlipayService;

/**
 * Created by lh on 2017/4/11.
 */
public class AlipayServiceImpl implements IAlipayService {

    private static AlipayConfig config;

    private AlipayClient alipayClient;

    private AlipayTradeWapPayRequest tradeWapPayRequest;

    private AlipayTradePrecreateRequest tradePrecreateRequest;

    public AlipayServiceImpl(AlipayConfig config) {
        this.setConfig(config);
    }

    public String buildWapPayForm(AlipayWapBizObject bizObject) throws AlipayApiException {
        String bizContent = JSON.toJSONString(bizObject);
        this.getTradeWapPayRequest().setBizContent(bizContent);
        String form = this.getClient().pageExecute(this.getTradeWapPayRequest()).getBody();
        return form;
    }

    public String buildQrCode(AlipayPrecreateBizObject bizObject) throws AlipayApiException {
        String bizContent = JSON.toJSONString(bizObject);
        this.getTradePrecreateRequest().setBizContent(bizContent);
        AlipayTradePrecreateResponse response = this.getClient().execute(this.getTradePrecreateRequest());
        return response.getBody();
    }

    private AlipayClient getClient() {
        if (this.alipayClient == null) {
            this.alipayClient = new DefaultAlipayClient(config.getServerUrl(), config.getAppId(), config.getPrivateKey(), config.getFormat(), config.getCharset(), config.getPublicKey(), config.getSignType());
        }
        return this.alipayClient;
    }

    private AlipayTradeWapPayRequest getTradeWapPayRequest() {
        if (this.tradeWapPayRequest == null) {
            this.tradeWapPayRequest = new AlipayTradeWapPayRequest();
            this.tradeWapPayRequest.setReturnUrl(this.config.getReturnUrl());
            this.tradeWapPayRequest.setNotifyUrl(this.config.getNotifyUrl());
        }
        return this.tradeWapPayRequest;
    }

    private AlipayTradePrecreateRequest getTradePrecreateRequest() {
        if (this.tradePrecreateRequest == null) {
            this.tradePrecreateRequest = new AlipayTradePrecreateRequest();
            this.tradePrecreateRequest.setReturnUrl(this.config.getReturnUrl());
            this.tradePrecreateRequest.setNotifyUrl(this.config.getNotifyUrl());
        }
        return this.tradePrecreateRequest;
    }

    public static AlipayConfig getConfig() {
        return config;
    }

    public static void setConfig(AlipayConfig config) {
        AlipayServiceImpl.config = config;
    }
}
