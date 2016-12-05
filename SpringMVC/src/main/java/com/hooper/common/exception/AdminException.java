package com.hooper.common.exception;

/**
 * Created by hooper on 2016/12/5.
 */
public class AdminException extends ErrorCodeException{
    public AdminException(String code) {
        super(code);
    }

    public AdminException(String code, String message) {
        super(code, message);
    }

    public AdminException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public AdminException(Throwable cause) {
        super(cause);
    }

    protected AdminException(String code, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(code, message, cause, enableSuppression, writableStackTrace);
    }
}
