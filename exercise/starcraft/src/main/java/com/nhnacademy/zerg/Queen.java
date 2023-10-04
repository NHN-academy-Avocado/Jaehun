package com.nhnacademy.zerg;

import com.nhnacademy.Flyable;
import com.nhnacademy.Unit;

public class Queen extends Unit implements Flyable {
    public Queen(){
        super("Queen", 15,25);
    }
    @Override
    public boolean fly(){
        return true;
    }
}
