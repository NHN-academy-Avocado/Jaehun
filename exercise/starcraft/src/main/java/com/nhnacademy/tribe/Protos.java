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

import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.File;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class Protos extends Tribe {
    @Override
    public void addUnit() {
        unitCount = 4;
        List<String> protosNameList = new ArrayList<>();
        //
        File packageDir = new File("src/main/java/com/nhnacademy/protos");
        String[] classFiles = packageDir.list();
        if (classFiles != null) {
            for (String classFile : classFiles) {
                String className = classFile.substring(0, classFile.lastIndexOf('.'));
                protosNameList.add("com.nhnacademy.protos." + className);
            }
        }
        //
//        try {
//            // Use classloader to get resources
//            URL directoryURL = this.getClass().getClassLoader().getResource("com/nhnacademy/protos");
//
//            if (directoryURL != null && directoryURL.getProtocol().equals("file")) {
//                // Running outside of JAR (e.g. in IDE)
//                File packageDir = new File(directoryURL.toURI());
//                String[] classFiles = packageDir.list();
//                if (classFiles != null) {
//                    for (String classFile : classFiles) {
//                        if (classFile.endsWith(".class")) {
//                            String className =
//                                    "com.nhnacademy.protos." + classFile.substring(0, classFile.lastIndexOf('.'));
//                            protosNameList.add(className);
//                        }
//                    }
//                }
//            } else if (directoryURL != null && directoryURL.getProtocol().equals("jar")) {
//                // Running from JAR
//                String jarPath = directoryURL.getPath().substring(5, directoryURL.getPath().indexOf("!"));
//                JarFile jar = new JarFile(URLDecoder.decode(jarPath, StandardCharsets.UTF_8.name()));
//                Enumeration<JarEntry> entries = jar.entries();
//                while (entries.hasMoreElements()) {
//                    JarEntry entry = entries.nextElement();
//                    String name = entry.getName();
//                    if (name.startsWith("com/nhnacademy/protos/") && name.endsWith(".class")) {
//                        String className =
//                                name.replace("/", ".").substring(0, name.length() - 6); // 6 chars for ".class"
//                        protosNameList.add(className);
//                    }
//                }
//                jar.close();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //

        for (int i = 0; i < unitCount; i++) {
            Collections.shuffle(protosNameList);
            String className = protosNameList.get(0);
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
