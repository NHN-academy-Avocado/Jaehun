//import java.io.*;
//
//public class Exercise1 {
//    public static void main(String[] args) throws IOException {
//        InputStream is = System.in;
//        OutputStream os = System.out;
//        String[] result = loadArray(is, 5);
//        saveArray(os, result);
//    }
//    public static String[] loadArray(InputStream is, int n) throws IOException {
//        String[] result = new String[n];
//        System.out.println("문자열을 입력하세요");
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(is));) {
//            for (int i = 0; i < n; i++) {
//                result[i] = br.readLine();
//            }
//        }
//        return result;
//    }
//    public static void saveArray(OutputStream os, String[] sa){
//        System.out.println("문자열을 출력합니다");
//        try(PrintWriter pw = new PrintWriter(os);) {
//            for (int i = 0; i < sa.length; i++) {
//                pw.println(sa[i]);
//            }
//        }
//    }
//}
import java.io.*;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        OutputStream os = System.out;
        String[] result = loadArray(is, 5);
        saveArray(os, result);
    }

    public static String[] loadArray(InputStream is, int n) throws IOException {
        String[] result = new String[n];
        System.out.println("문자열을 입력하세요");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        for (int i = 0; i < n; i++) {
            result[i] = br.readLine();
        }
        br.close();
        return result;
    }

    public static void saveArray(OutputStream os, String[] sa) {
        System.out.println("문자열을 출력합니다");
        PrintWriter pw = new PrintWriter(os);
        for (int i = 0; i < sa.length; i++) {
            pw.println(sa[i]);

        }
        pw.close();
    }
}
