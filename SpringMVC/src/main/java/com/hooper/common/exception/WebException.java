package com.hooper.common.exception;

/**
 * Created by hooper on 2016/12/5.
 */
public class WebException extends ErrorCodeException{
    public WebException(String code) {
        super(code);
    }

    public WebException(String code, String message) {
        super(code, message);
    }

    public WebException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public WebException(Throwable cause) {
        super(cause);
    }

    protected WebException(String code, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(code, message, cause, enableSuppression, writableStackTrace);
    }
}
