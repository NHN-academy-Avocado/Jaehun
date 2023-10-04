package com.nhnacademy;

public interface Flyable {
    default boolean fly(){
        return false;
    }
    default boolean flyAttack(){
        return false;
    }
}
