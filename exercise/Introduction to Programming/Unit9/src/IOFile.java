import java.io.*;

public class IOFile {
    String fileName;

    public IOFile(String fileName) {
        this.fileName = fileName;
    }

    public int countLines(){
        int result = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(this.fileName))) {
            while (br.readLine() != null) {
                result++;
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    public void write(OutputStream os)  {

        try (BufferedReader br = new BufferedReader(new FileReader(this.fileName));
             PrintWriter pw = new PrintWriter(os)) {
            String s;
            while ((s = br.readLine()) != null) {
                pw.println(s);
            }
            pw.flush();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


    public void print() {
        try (BufferedReader br = new BufferedReader(new FileReader(this.fileName))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void copy(String filename)  {
        try (BufferedReader br = new BufferedReader(new FileReader(this.fileName));
             PrintWriter pw = new PrintWriter(new FileWriter(filename));) {
            String s;
            while ((s = br.readLine()) != null) {
                pw.println(s);
            }
            pw.flush();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void delete() {
        File file = new File(this.fileName);
        boolean b = file.delete();
        System.out.println(b? this.fileName + " 삭제성공" : this.fileName + " 삭제실패");
    }
}