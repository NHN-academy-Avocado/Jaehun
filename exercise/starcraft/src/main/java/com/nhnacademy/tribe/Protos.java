//package com.nhnacademy.tribe;
//import com.nhnacademy.Unit;
//import java.util.*;
//
//
//public class Protos extends Tribe{
//   @Override
//   public void addUnit(){
//       unitCount = 4;
//       List<String> protosNameList = new ArrayList<>();
//       protosNameList.add("Zealot");
//       protosNameList.add("Dragoon");
//       protosNameList.add("HighTempler");
//       protosNameList.add("Scout");
//       protosNameList.add("Corsair");
//       protosNameList.add("Carrier");
//
//       for (int i = 0; i < unitCount; i++) {
//           Collections.shuffle(protosNameList);
//           String className = "com.nhnacademy.protos." + protosNameList.get(0);
//           try {
//               Class<? extends Unit> clazz = (Class<? extends Unit>) Class.forName(className);
//               Unit unit = clazz.getDeclaredConstructor().newInstance();
//               unitList.add(unit);
//           } catch (Exception e) {
//               e.printStackTrace();
//           }
//       }
//   }
//
//}

package com.nhnacademy.tribe;

import com.nhnacademy.Unit;

import java.util.*;
import java.io.File;

public class Protos extends Tribe {
    @Override
    public void addUnit() {
        unitCount = 4;
        List<String> protosNameList = new ArrayList<>();
        File packageDir = new File("src/main/java/com/nhnacademy/protos");
        String[] classFiles = packageDir.list();
        if (classFiles != null) {
            for (String classFile : classFiles) {
                String className = classFile.substring(0, classFile.lastIndexOf('.'));
                protosNameList.add(className);
            }
        }
        for (int i = 0; i < unitCount; i++) {
            Collections.shuffle(protosNameList);
            String className = "com.nhnacademy.protos." + protosNameList.get(0);
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
