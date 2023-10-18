import java.util.Arrays;

public class Triangles {
    double a, b, c;
    double[] arr = new double[3];

    public Triangles(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        Arrays.sort(arr);
    }

    public boolean test() {
        return (arr[2] < (arr[0] + arr[1]));
    }

    public double perimeter() {
        return a + b + c;
    }

    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt((s * (s - a) * (s - b) * (s - c)));
    }

    public double getLongest() {
        return arr[2];
    }

    public double getIntermediate() {
        return arr[1];
    }

    public double getShortest() {
        return arr[0];
    }

    public String type() {
        int equal = 0;
        if (a == b) {
            equal++;
        }
        if (b == c) {
            equal++;
        }
        if (a == c) {
            equal++;
        }

        if (equal == 0) {
            return "it is irregular";
        } else if (equal == 1) {
            return "it is symmetric";
        } else {
            return "it is regular";
        }
    }
}