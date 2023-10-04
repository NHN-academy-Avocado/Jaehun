package com.nhnacademy.protos;
import com.nhnacademy.*;
public class Dragon extends Unit implements Flyable{
    public Dragon(){
        super("Dragon", 3,15);
    }
    @Override
    public boolean flyAttack(){
        return true;
    }
}
