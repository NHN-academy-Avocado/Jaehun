import java.io.*;

public class IOFile {
    String fileName;

    public IOFile(String fileName) {
        this.fileName = fileName;
    }
    public int countLines() throws IOException {
        int result=0;
        BufferedReader br = new BufferedReader(new FileReader(this.fileName));
        while(br.readLine() !=null){
            result++;
        }
        br.close();
        return result;
    }
    public void write(OutputStream os) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(this.fileName));
        PrintWriter pw = new PrintWriter(os);
        String s;
        while((s=br.readLine())!=null){
            pw.println(s);
        }
        pw.close();
        br.close();
    }
    public void print() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(this.fileName));
        String s;
        while((s=br.readLine())!=null){
            System.out.println(s);
        }
        br.close();
    }
    public void copy(String filename) throws IOException{
        BufferedReader input = new BufferedReader(new FileReader(this.fileName));
        PrintWriter pw = new PrintWriter(new FileWriter(filename));
        String s;
        while((s=input.readLine())!=null){
            pw.println(s);
        }
        pw.close();
        input.close();
    }
    public void delete(){
        File file = new File(this.fileName);
        boolean b = file.delete();
        if(b){
            System.out.println(this.fileName + " 삭제성공");
        }else {
            System.out.println(this.fileName + " 삭제실패");
        }
    }
}
