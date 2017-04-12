package com.lh.gateway.model;

/**
 * Created by lh on 2017/4/11.
 */
public abstract class BizObject {
    //商户网站唯一订单号
    protected String out_trade_no;

    //订单总金额
    protected String total_amount;

    //商品的标题/交易标题/订单标题/订单关键字等
    protected String subject;

    //该笔订单允许的最晚付款时间,取值范围：1m～15d
    protected String timeout_express = "90m";

    public BizObject() {
    }

    public BizObject(String out_trade_no, String total_amount, String subject, String timeout_express) {
        this.out_trade_no = out_trade_no;
        this.total_amount = total_amount;
        this.subject = subject;
        this.timeout_express = timeout_express;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTimeout_express() {
        return timeout_express;
    }

    public void setTimeout_express(String timeout_express) {
        this.timeout_express = timeout_express;
    }
}
