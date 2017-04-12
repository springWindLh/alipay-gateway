package com.lh.gateway.model.alipay;

import com.lh.gateway.model.BizObject;

/**
 * Created by lh on 2017/4/11.
 */
public class AlipayPrecreateBizObject extends BizObject {
    //商户门店编号
    private String store_id;

    public AlipayPrecreateBizObject() {
    }

    public AlipayPrecreateBizObject(String out_trade_no, String total_amount, String subject, String timeout_express, String store_id) {
        super(out_trade_no, total_amount, subject, timeout_express);
        this.store_id = store_id;
    }

    public String getStore_id() {
        return store_id;
    }

    public void setStore_id(String store_id) {
        this.store_id = store_id;
    }
}
