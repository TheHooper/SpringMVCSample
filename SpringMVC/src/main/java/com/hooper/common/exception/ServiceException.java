package com.hooper.common.exception;

/**
 * Created by hooper on 2016/12/5.
 */
public class ServiceException extends ErrorCodeException{
    public ServiceException(String code) {
        super(code);
    }

    public ServiceException(String code, String message) {
        super(code, message);
    }

    public ServiceException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    protected ServiceException(String code, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(code, message, cause, enableSuppression, writableStackTrace);
    }
}
