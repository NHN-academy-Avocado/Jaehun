import java.io.*;
public class Exercise8 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3,3);
        matrix.save("src/ex9");
        Matrix.read("src/ex9");
        Matrix matrix1 = new Matrix(3,3);
        matrix.sum(matrix1);
        matrix.product(matrix1);
    }
}
