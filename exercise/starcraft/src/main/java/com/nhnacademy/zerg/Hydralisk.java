package com.nhnacademy.zerg;
import com.nhnacademy.*;
public class Hydralisk extends Unit implements Flyable{
    public Hydralisk(){
        super("Hydralisk",3,7);
    }
    @Override
    public boolean flyAttack(){
        return true;
    }
}
