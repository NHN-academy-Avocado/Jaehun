package com.nhnacademy;

public class Unit implements Flyable{
    private final String name;
    private final int power;
    private int defense;

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public Unit(String name, int power, int defense){
        this.name = name;
        this.power = power;
        this.defense = defense;
    }

    public void attack(Unit unit){
        if(this.fly() || this.flyAttack() || (!this.fly() && !unit.fly())) {   // fly:나는객체, flyAttack: 나는걸 공격 가능한 객체
            unit.defense(this);                             // 혹은 날수없는 객체가 날수없는 객체를 공격
        }
    }
    public void defense(Unit unit){
        this.setDefense(this.getDefense() - unit.getPower());
    }

    @Override
    public String toString() {
        return this.getName() + "(공력력: " + this.power +", 방어력: " + this.defense +")";
    }
}
