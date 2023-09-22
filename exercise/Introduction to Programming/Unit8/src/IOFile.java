import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class IOFile {
    String fileName;

    public IOFile(String fileName) {
        this.fileName = fileName;
    }

    public int countLines() throws IOException {
        int result = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(this.fileName));) {
            while (br.readLine() != null) {
                result++;
            }
        }
        return result;
    }

    public void write(OutputStream os) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(this.fileName));
             PrintWriter pw = new PrintWriter(os);) {
            String s;
            while ((s = br.readLine()) != null) {
                pw.println(s);
            }
        }
    }

    public void print() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(this.fileName));) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        }
    }

    public void copy(String filename) throws IOException {
        try (BufferedReader input = new BufferedReader(new FileReader(this.fileName));
             PrintWriter pw = new PrintWriter(new FileWriter(filename));) {
            String s;
            while ((s = input.readLine()) != null) {
                pw.println(s);
            }
        }
    }

    public void delete() {
        File file = new File(this.fileName);
        boolean b = file.delete();
        System.out.println(b? this.fileName + " 삭제성공" : this.fileName + " 삭제실패");
    }
}
