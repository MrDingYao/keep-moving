package com.santu.common.enums;

/**
 * @author santu
 * @date 2020/12/7 21:03
 */
public enum ResponseCodeEnum {

    QUERY_SUCCESS("A0001", "查询成功"),

    ADD_SUCCESS("A0002", "新增成功"),

    UPDATE_SUCCESS("A0003", "更新成功"),

    DELETE_SUCCESS("A0004", "删除成功"),

    NULL_PARAMS("E0001", "参数不能为空")
    ;

    private String code;

    private String msg;

    ResponseCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
