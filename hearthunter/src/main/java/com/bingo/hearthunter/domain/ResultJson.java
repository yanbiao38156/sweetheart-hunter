package com.bingo.hearthunter.domain;

import java.io.Serializable;

/**
 * Created by yanbiao on 2017/10/16.
 */
public class ResultJson<T> implements Serializable{
    public static final int SUCCESS = 0;
    public static final int FAIL = 1;

    private String msg = "success";
    private int code = SUCCESS;
    private T data;

    public void setMsg(String msg){
        this.msg = msg;
    }

    public ResultJson() {
        super();
    }

    public ResultJson(T data){
        super();
        this.data = data;
    }

    public ResultJson(Throwable e){
        super();
        this.msg = e.getMessage();
        this.code = FAIL;
    }
}
