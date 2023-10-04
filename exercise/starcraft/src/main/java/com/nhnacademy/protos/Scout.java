package com.nhnacademy.protos;
import com.nhnacademy.*;
public class Scout extends Unit implements Flyable {
    public Scout(){
        super("Scout", 5,10);
    }
    @Override
    public boolean fly(){
        return true;
    }
}
