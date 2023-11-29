package me.xueyao.ueyaodiary.base;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description: 返回对象
 * @author: Simon.Xue
 * @date 2023-11-30 01:04:41
 **/
@Getter
@NoArgsConstructor
public class R implements Serializable {

    private Integer code;
    private String msg;
    private Object data;

    public R(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public R(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static R ofSuccess(String msg) {
        return new R(RStatus.SUCCESS.getCode(), msg);
    }

    public static R ofSuccess(String msg, Object data) {
        return new R(RStatus.SUCCESS.getCode(), msg, data);
    }

    public static R ofParamError(String msg) {
        return new R(RStatus.BAD_REQUEST.getCode(), msg);
    }

    public static R ofSystemError(String msg) {
        return new R(RStatus.BAD_REQUEST.getCode(), msg);
    }
}
