package com.nhnacademy.terran;

import com.nhnacademy.Flyable;
import com.nhnacademy.Unit;

public class Goliath extends Unit implements Flyable {
    public Goliath(){
        super("Goliath", 5,15);
    }
    @Override
    public boolean flyAttack() {
        return true;
    }
}
