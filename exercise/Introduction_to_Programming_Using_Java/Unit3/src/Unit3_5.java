import org.w3c.dom.Text;

public class Unit3_5 {
    public static void main(String[] args) {
        int count =0;
        double sum = 0.0;
        try{
            TextIO.readFile("src/sales.dat");
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        while(!TextIO.eof() ){
            char ch=TextIO.getChar();
            while(ch !=':'){
                ch = TextIO.getChar();
            }
            String line = TextIO.getln();
            try{
                sum+=Double.parseDouble(line);
            }catch(NumberFormatException e){
                count++;
            }
        }
        System.out.println("Total: " + sum);
        System.out.println("no data count: " + count);
    }
}
