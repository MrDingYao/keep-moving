package com.santu.common.process;

/**
 * @author santu
 * @date 2020/12/8 20:18
 */
public interface Process<T> {

    /**
     * 参数校验
     */
    default void check(){};

    /**
     * 前置处理
     */
    default void before(){};

    /**
     * 处理并返回
     * @return
     */
    T process();

    /**
     * 后置处理
     */
    default void onSuccess(){};

    /**
     * 异常处理
     */
    default void onError(){};

    /**
     * 处理流
     * @return
     */
    default T execute(){
        T result = null;
        try {
            check();
            before();
            result = process();
            onSuccess();
        } catch (Exception e) {
            onError();
            throw e;
        }
        return result;
    }
}
