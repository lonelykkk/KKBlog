package com.kkk.handler.exception;

import com.kkk.common.enums.AppHttpCodeEnum;
import com.kkk.common.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(SystemException.class)
    public Result systemExceptionHandler(SystemException e){
        //打印异常信息
        log.error("出现了异常！ {}",e);
        //从异常对象中获取提示信息封装返回
        return Result.errorResult(e.getCode(),e.getMsg());
    }


    @ExceptionHandler(Exception.class)
    public Result exceptionHandler(Exception e){
        //打印异常信息
        log.error("出现了异常！ {}",e.getMessage());
        //从异常对象中获取提示信息封装返回
        return Result.errorResult(AppHttpCodeEnum.SYSTEM_ERROR.getCode(),e.getMessage());
    }
}
