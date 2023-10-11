public class Unit2_7 {
    public static void main(String[] args) {
        TextIO.readFile("src/testdata.txt");
        String name = TextIO.getlnString();
        int a = TextIO.getlnInt();
        int b = TextIO.getlnInt();
        int c = TextIO.getlnInt();
        double avg = (a+b+c)/3.0;
        System.out.printf("Name is %s, avg is %1.2f", name, avg);
    }
}
