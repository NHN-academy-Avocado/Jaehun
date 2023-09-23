import java.io.*;
public class Matrix {
    private int n;
    private int m;
    private int[][] arr;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.arr = new int[n][m];
    }
    public void save(String filename) {
        try(PrintWriter out = new PrintWriter(new FileWriter(filename));) {
            out.println(this.n);
            out.println(this.m);
            for (int i = 0; i < this.n; i++) {
                for (int j = 0; j < this.m; j++) {
                    out.println(arr[i][j]);
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static Matrix read(String filename) throws ExceptionWrongMatrixValues, ExceptionWrongMatrixDimension{
        Matrix tmp = null;
        try (BufferedReader br = new BufferedReader(new FileReader(filename));){
            int n = 0;
            while ((n = Integer.parseInt(br.readLine())) != 0) {
                tmp = new Matrix(n, Integer.parseInt(br.readLine()));

                for (int i = 0; i < tmp.n; i++) {
                    for (int j = 0; j < tmp.m; j++) {
                        try{
                            int value = Integer.parseInt(br.readLine());
                            tmp.arr[i][j] = value;
                        }catch(NumberFormatException e){
                            throw new ExceptionWrongMatrixValues("data on the file does not correspond to numeric values");}
                    }
                }
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            throw new ExceptionWrongMatrixDimension("data are not consistent with the form of a matrix");
        }
        return tmp;
    }
    public Matrix sum(Matrix m){
        if(this.n==m.n && this.m==m.m){
            Matrix tmp = new Matrix(this.n,this.m);
            for(int i=0; i<this.n; i++){
                for(int j=0; j < this.m; j++){
                    tmp.arr[i][j]=this.arr[i][j]+m.arr[i][j];
                }
            }
            return tmp;
        }else{
            return null;
        }
    }

    public Matrix product(Matrix m){
        Matrix tmp;
        if(this.m==m.n){
            tmp = new Matrix(this.n,m.m);
            for(int i=0; i<tmp.n; i++){
                for(int j=0; j<tmp.m; j++){
                    for(int k=0; k<tmp.m; k++){
                        tmp.arr[i][j] = this.arr[i][k] * m.arr[k][j];
                    }
                }
            }
        }else if(m.m==this.n){
            tmp = new Matrix(m.m, this.n);
            for(int i=0; i<tmp.n; i++){
                for(int j=0; j<tmp.m; j++){
                    for(int k=0; k<tmp.m; k++){
                        tmp.arr[i][j] = m.arr[i][k] * this.arr[k][j];
                    }
                }
            }
        }else {
            return null;
        }
        return tmp;
    }
}



