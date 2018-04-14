package com.transport.user.pojo.vo;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ResultData<T> {
    private Integer code;
    private String errMsg;
    private T data;
    // 成功函数
    public static <T> ResultData succ(T data){
        return new ResultData<T>().builder().code(20000).data(data).build();
    }

    // 失败函数
    public static ResultData fail(Integer code, String errMsg) {
        return new ResultData().builder().code(code).errMsg(errMsg).build();
    }

}
