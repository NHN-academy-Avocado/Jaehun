package com.nhnacademy.tribe;
import com.nhnacademy.Unit;
import java.util.*;
public class Zerg extends Tribe{
    @Override
    public void addUnit(){
        List<String> zergNameList = new ArrayList<>();
        zergNameList.add("Zergling");
        zergNameList.add("Hydralisk");
        zergNameList.add("Ultralisk");
        zergNameList.add("Mutalisk");
        zergNameList.add("Guardian");
        zergNameList.add("Queen");

        for (int i = 0; i < 8; i++) {
            Collections.shuffle(zergNameList);
            String className = "com.nhnacademy.zerg." + zergNameList.get(0);
            try {
                Class<? extends Unit> clazz = (Class<? extends Unit>) Class.forName(className);
                Unit unit = clazz.getDeclaredConstructor().newInstance();
                unitList.add(unit);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

