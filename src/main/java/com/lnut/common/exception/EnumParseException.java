package com.lnut.common.exception;

/**
 * Created by L on 16/6/6.
 */
public class EnumParseException extends RuntimeException {
    public EnumParseException(){
        super();
    }

    public EnumParseException(String val){
        super("no enum for value ["+val+"]");
    }

    public EnumParseException(int val){
        super("no enum for value ["+val+"]");
    }
}
