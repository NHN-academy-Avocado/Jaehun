package com.nhnacademy.tribe;
import com.nhnacademy.Unit;
import java.util.*;

public class Terran extends Tribe {


    @Override
    public void addUnit(){
        unitCount = 5;
        List<String> terranNameList = new ArrayList<>();
        terranNameList.add("Marine");
        terranNameList.add("Tank");
        terranNameList.add("Goliath");
        terranNameList.add("Wraith");
        terranNameList.add("Valkyrie");
        terranNameList.add("BattleCruzer");

        for (int i = 0; i < unitCount; i++) {
            Collections.shuffle(terranNameList);
            String className = "com.nhnacademy.terran." + terranNameList.get(0);
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
