package com.nhnacademy.terran;

import com.nhnacademy.*;

public class Valkyrie extends Unit implements Flyable {
    public Valkyrie() {
        super("Valkyrie", 4, 12);
    }
    @Override
    public boolean fly() {
        return true;
    }
}
