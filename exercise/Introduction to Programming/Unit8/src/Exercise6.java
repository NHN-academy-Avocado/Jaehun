import java.io.*;

public class Exercise6 {
    public static void main(String[] args) throws IOException{
        IOFile ioFile = new IOFile("src/ex6.txt");
        System.out.println(ioFile.countLines());
        OutputStream os = System.out;
        ioFile.write(os);
        System.out.println("testLine");
//        ioFile.print();
//        ioFile.copy("src/ex66.txt");
//        ioFile.delete();
    }
}
