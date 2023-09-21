import java.io.*;
public class Exercise9 {
    public static void main(String[] args)throws IOException {
        Matrix matrix = new Matrix(3,3);
        matrix.save("src/ex9");
        matrix.read("src/ex9");
        Matrix matrix1 = new Matrix(3,3);
        matrix.sum(matrix1);
        matrix.product(matrix1);
    }
}
