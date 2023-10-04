package com.nhnacademy.tribe;

import com.nhnacademy.Unit;
import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class Terran extends Tribe {

@Override
public void addUnit() {
    unitCount = 5;
    List<String> terranNameList = new ArrayList<>();
    File packageDir = new File("src/main/java/com/nhnacademy/terran");
    String[] classFiles = packageDir.list();
    if (classFiles != null) {
        for (String classFile : classFiles) {
            String className = classFile.substring(0, classFile.lastIndexOf('.'));
            terranNameList.add("com.nhnacademy.terran." + className);
        }
    }

    for (int i = 0; i < unitCount; i++) {
        Collections.shuffle(terranNameList);
        String className = terranNameList.get(0);
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
