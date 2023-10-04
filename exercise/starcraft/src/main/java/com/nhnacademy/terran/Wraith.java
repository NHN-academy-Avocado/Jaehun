package com.nhnacademy.terran;
import com.nhnacademy.*;
public class Wraith extends Unit implements Flyable{
    public Wraith() {
        super("Wraith", 3, 10);
    }
    @Override
    public boolean fly() {
        return true;
    }
}
