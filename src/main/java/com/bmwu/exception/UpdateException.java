package com.bmwu.exception;

/**
 * Created by michael on 3/3/17.
 */
public class UpdateException extends Exception {

    private static final long serialVersionUID = 1L;

    public UpdateException(){}

    public UpdateException(String message){
        super(message);
    }
}
