package com.lh.gateway.config;

import com.lh.gateway.config.alipay.PayConfig;

/**
 * Created by lh on 2017/4/11.
 */
public class AlipayConfig extends PayConfig {
    private String privateKey;
    private String publicKey;
    private String serverUrl;
    private String appId;
    private String format = "json";
    private String charset = "utf-8";
    //签名的加密方式
    private String signType = "RSA2";

    private String returnUrl;
    private String notifyUrl;

    public AlipayConfig() {
    }

    public AlipayConfig(String privateKey, String publicKey, String serverUrl, String appId, String format, String charset, String signType, String returnUrl, String notifyUrl) {
        this.privateKey = privateKey;
        this.publicKey = publicKey;
        this.serverUrl = serverUrl;
        this.appId = appId;
        this.format = format;
        this.charset = charset;
        this.signType = signType;
        this.returnUrl = returnUrl;
        this.notifyUrl = notifyUrl;
    }

    public AlipayConfig(String privateKey, String publicKey, String serverUrl, String appId) {
        this.privateKey = privateKey;
        this.publicKey = publicKey;
        this.serverUrl = serverUrl;
        this.appId = appId;
    }

    public AlipayConfig(String privateKey, String publicKey, String serverUrl, String appId, String returnUrl, String notifyUrl) {
        this.privateKey = privateKey;
        this.publicKey = publicKey;
        this.serverUrl = serverUrl;
        this.appId = appId;
        this.returnUrl = returnUrl;
        this.notifyUrl = notifyUrl;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }
}
