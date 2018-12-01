package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * 自定义异常
 * Created by Administrator on 2018/12/1.
 */
public class GirlException extends RuntimeException {
    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
