package com.nhnacademy.zerg;
import com.nhnacademy.*;
public class Mutalisk extends Unit implements Flyable{
    public Mutalisk(){
        super("Mutalisk", 2,8);
    }
    @Override
    public boolean fly() {
        return true;
    }
}
