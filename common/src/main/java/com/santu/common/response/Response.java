package com.santu.common.response;

import com.santu.common.enums.ResponseCodeEnum;

/**
 * @author santu
 * @date 2020/12/7 21:01
 */
public class Response<E> {

    private boolean success;

    private String code;

    private String msg;

    private E data;

    public Response(boolean success, String code, String msg, E data) {
        this.msg = msg;
        this.code = code;
        this.success = success;
        this.data = data;
    }

    public Response(String code, String msg) {
        this.success = false;
        this.code = code;
        this.msg = msg;
    }

    public Response(E data) {
        this.success = true;
        this.data = data;
    }

    public static <E> Response<E> ok(E data) {
        return new Response<E>(data);
    }

    public static <E> Response<E> ok() {
        return new Response<E>(true, null, null, null);
    }

    public static<E> Response<E> failed(ResponseCodeEnum codeEnum) {
        return new Response<>(codeEnum.getCode(), codeEnum.getMsg());
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
