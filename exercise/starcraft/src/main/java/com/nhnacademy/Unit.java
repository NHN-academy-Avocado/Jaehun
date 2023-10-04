package com.nhnacademy;

public class Unit implements Flyable {
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

    public Unit(String name, int power, int defense) {
        this.name = name;
        this.power = power;
        this.defense = defense;
    }

    public boolean attack(Unit unit) {
        if (unit.getDefense() > 0 && this.getDefense() > 0) {
            if (this.fly() || this.flyAttack() ||
                    (!this.fly() && !unit.fly())) {   // fly:나는객체, flyAttack: 나는걸 공격 가능한 객체
                unit.defense(this);                             // 혹은 날수없는 객체가 날수없는 객체를 공격
                return true;
            } else {
                System.out.println(this.getName() + "는 " + unit.getName() + "을 공격 불가능한 조건 입니다");
            }
        } else if (this.getDefense() <= 0) {
            System.out.println("죽은 유닛으로은 공격할 수 없습니다");
        } else {
            System.out.println("방어력이 0보다 작은 유닛은 공격 불가능합니다.");
        }
        return false;
    }

    public void defense(Unit unit) {
        this.setDefense(this.getDefense() - unit.getPower());
    }

    @Override
    public String toString() {
        return this.getName() + "(공력력: " + this.power + ", 방어력: " + this.defense + ")";
    }
}
