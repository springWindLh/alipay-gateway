package com.lh.gateway.request;

import com.lh.gateway.model.BizObject;

/**
 * Created by lh on 2017/4/11.
 */
public abstract class PayRequest {
    protected BizObject bizObject;

    public BizObject getBizObject() {
        return bizObject;
    }

    public void setBizObject(BizObject bizObject) {
        this.bizObject = bizObject;
    }
}
