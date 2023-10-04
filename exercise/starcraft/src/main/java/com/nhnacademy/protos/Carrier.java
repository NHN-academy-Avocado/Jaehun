package com.nhnacademy.protos;

import com.nhnacademy.Flyable;
import com.nhnacademy.Unit;

public class Carrier extends Unit implements Flyable {
    public Carrier(){
        super("Carrier", 25,40);
    }
    @Override
    public boolean fly(){
        return true;
    }
}
