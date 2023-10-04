package com.nhnacademy.terran;

import com.nhnacademy.*;

public class Tank extends Unit implements Flyable {
    public Tank() {
        super("Tank", 7, 15);
    }
    @Override
    public boolean flyAttack() {
        return true;
    }
}
