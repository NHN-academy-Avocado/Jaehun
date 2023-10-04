package com.nhnacademy.tribe;
import com.nhnacademy.Unit;
import java.io.File;
import java.util.*;
public class Zerg extends Tribe{

    @Override
    public void addUnit(){
        unitCount = 8;
        List<String> zergNameList = new ArrayList<>();
        File packageDir = new File("src/main/java/com/nhnacademy/zerg");
        String[] classFiles = packageDir.list();
        if (classFiles != null) {
            for (String classFile : classFiles) {
                String className = classFile.substring(0, classFile.lastIndexOf('.'));
                zergNameList.add(className);
            }
        }

        for (int i = 0; i < unitCount; i++) {
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

