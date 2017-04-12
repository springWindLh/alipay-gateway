package com.lh.gateway.model.alipay;

import com.lh.gateway.model.BizObject;

/**
 * Created by lh on 2017/4/11.
 */
public class AlipayWapBizObject extends BizObject {

    //收款支付宝用户ID(如果该值为空，则默认为商户签约账号对应的支付宝用户ID)
    private String seller_id;

    //商品主类型：0—虚拟类商品，1—实物类商品
    private String goods_type;

    private String product_code = "QUICK_WAP_PAY";

    public AlipayWapBizObject() {
    }

    public AlipayWapBizObject(String out_trade_no, String total_amount, String subject, String timeout_express, String seller_id) {
        super(out_trade_no, total_amount, subject, timeout_express);
        this.seller_id = seller_id;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public String getGoods_type() {
        return goods_type;
    }

    public void setGoods_type(String goods_type) {
        this.goods_type = goods_type;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }
}
