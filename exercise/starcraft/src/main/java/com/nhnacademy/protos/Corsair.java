package com.nhnacademy.protos;
import com.nhnacademy.*;
public class Corsair extends Unit implements Flyable{
    public Corsair(){
        super("Corsair", 4,12);
    }
    @Override
    public boolean fly(){
        return true;
    }
}
