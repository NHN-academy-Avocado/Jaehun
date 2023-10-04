package com.nhnacademy.tribe;

import com.nhnacademy.Unit;
import java.util.ArrayList;
import java.util.List;

public abstract class Tribe {


    public int getUnitCount() {
        return unitCount;
    }

    protected int unitCount;
    public List<Unit> unitList = new ArrayList<>();

    public Tribe() {
        addUnit();
    }

    public abstract void addUnit();

    public void printTribe() {
        for (int i = 0; i < unitList.size(); i++) {
            if (unitList.get(i).getDefense() > 0) {
                System.out.println(i + ". " + unitList.get(i));
            }
        }
    }

    public void deleteUnit(int index) {
        unitCount--;
    }


    public Unit getUnit(int index) {
        return unitList.get(index);
    }
}