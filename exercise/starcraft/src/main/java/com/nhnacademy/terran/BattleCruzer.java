package com.nhnacademy.terran;

import com.nhnacademy.Flyable;
import com.nhnacademy.Unit;

public class BattleCruzer extends Unit implements Flyable {
    public BattleCruzer() {
        super("BattleCruzer", 20, 30);
    }
    @Override
    public boolean fly(){
        return true;
    }
}
