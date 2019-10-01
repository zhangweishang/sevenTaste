package com.sise.bean;

/**
 * @program: QIWEI->WeChatSession
 * @author: ZJ
 * @create: 2019-10-01 09:14
 * @description:微信服务器返回的bean
 **/
public class WeChatSession {

    private String openid;
    private String session_key;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }
}
