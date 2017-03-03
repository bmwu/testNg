package com.bmwu.exception;

/**
 * Created by michael on 3/3/17.
 */
public class SaveException extends Exception{

    private static final long serialVersionUID = 1L;

    public SaveException(){}

    public SaveException(String message){
        super(message);
    }
}
