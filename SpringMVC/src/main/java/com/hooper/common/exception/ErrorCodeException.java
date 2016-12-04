package com.hooper.common.exception;

/**
 * Created by hooper on 2016/11/15.
 */
public class ErrorCodeException extends RuntimeException {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 2332608236621015980L;

    private String code;

    private String message;

    public ErrorCodeException(String code) {
        super();
        this.code = code;
    }


    public ErrorCodeException(String code , String message) {
        super(message);
        this.code = code;
        this.message = message;
    }


    public ErrorCodeException(
            String code , String message, Throwable cause) {
            super(message, cause);
        this.code = code;
        this.message = message;
    }


    public ErrorCodeException(Throwable cause) {
        super(cause);
    }


    protected ErrorCodeException(String code,String message, Throwable cause,
                               boolean enableSuppression,
                               boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
