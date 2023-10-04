package com.nhnacademy.tribe;

import com.nhnacademy.Unit;
import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class Zerg extends Tribe {

    @Override
    public void addUnit() {
        unitCount = 8;
        List<String> zergNameList = new ArrayList<>();
        File packageDir = new File("src/main/java/com/nhnacademy/zerg");
        String[] classFiles = packageDir.list();
        if (classFiles != null) {
            for (String classFile : classFiles) {
                String className = classFile.substring(0, classFile.lastIndexOf('.'));
                zergNameList.add("com.nhnacademy.zerg." + className);
            }
        }

        for (int i = 0; i < unitCount; i++) {
            Collections.shuffle(zergNameList);
            String className = zergNameList.get(0);
            try {
                Class<? extends Unit> tmpClass = (Class<? extends Unit>) Class.forName(className);
                Unit unit = tmpClass.getDeclaredConstructor().newInstance();
                unitList.add(unit);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}

