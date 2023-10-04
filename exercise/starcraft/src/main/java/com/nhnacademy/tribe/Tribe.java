package com.nhnacademy.tribe;

import com.nhnacademy.Unit;
import java.util.ArrayList;
import java.util.List;

public abstract class Tribe {
    public List<Unit> unitList = new ArrayList<>();
    public Tribe(){
        addUnit();
    }
    public abstract void addUnit();
    public void printTribe(){
        for(int i=0; i<unitList.size(); i++){
            System.out.println(i + ". " + unitList.get(i));
        }
        System.out.println();
    }
    public void deleteUnit(int index){
        unitList.remove(index);
    }
    public int getLeftUnit(){
        return this.unitList.size();
    }
    public Unit getUnit(int index) {
        return unitList.get(index);
    }
}