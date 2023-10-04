package com.nhnacademy.zerg;
import com.nhnacademy.*;
public class Guardian extends Unit implements Flyable{
    public Guardian(){
        super("Guardian", 3,6);
    }
    @Override
    public boolean fly() {
        return true;
    }
}
