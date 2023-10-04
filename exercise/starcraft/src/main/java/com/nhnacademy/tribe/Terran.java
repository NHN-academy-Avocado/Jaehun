package com.nhnacademy.tribe;
import com.nhnacademy.Unit;
import java.io.File;
import java.util.*;

public class Terran extends Tribe {


    @Override
    public void addUnit(){
        unitCount = 5;
        List<String> terranNameList = new ArrayList<>();
        File packageDir = new File("src/main/java/com/nhnacademy/terran");
        String[] classFiles = packageDir.list();
        if (classFiles != null) {
            for (String classFile : classFiles) {
                String className = classFile.substring(0, classFile.lastIndexOf('.'));
                terranNameList.add(className);
            }
        }
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
