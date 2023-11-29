package me.xueyao.ueyaodiary.base;

import lombok.Getter;

/**
 * @description:
 * @author: Simon.Xue
 * @date 2023-11-30 01:06:02
 **/
@Getter
public enum RStatus {
    //状态
    BAD_REQUEST(400, "请求有误"),
    UN_AUTHORIZED(401, "用户未身份认证"),
    NO_PERMISSION(403, "没有接口权限"),
    NOT_FOUND(404, "您所访问的资源不存在"),
    METHOD_NOT_ALLOWED(405, "方法不被允许"),
    SUCCESS(200, "成功");

    private final Integer code;
    private final String message;

    RStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
