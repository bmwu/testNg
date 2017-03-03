package com.bmwu.testng.exception;

/**
 * Created by michael on 3/3/17.
 */
public class NotFoundException extends Exception{
    private static final long serialVersionUID = 1L;

    public NotFoundException(){}

    public NotFoundException(String message){
        super(message);
    }
}
