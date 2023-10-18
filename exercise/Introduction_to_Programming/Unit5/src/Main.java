import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        exercise1(41);
        exercise2(2, 2, 2);
        exercise3(6, 6, 6);

        double a = Double.parseDouble(JOptionPane.showInputDialog("Insert first side"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Insert second side"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Insert third side"));
        Triangles tr = new Triangles(a, b, c);
        System.out.println("longest: " + tr.getLongest() + ", intermediate: " + tr.getIntermediate() +
                ", shortest: " + tr.getShortest());
        System.out.println("Sides Check: " + tr.test() + "\nperimeter: " + tr.perimeter());
        System.out.println("area: " + tr.area() + "\ntype: " + tr.type());

        exercise5(1,4,4);
        exercise6("vocal");

        Date date1 = new Date(28, 2, 2020);
        Date date2 = new Date(28, 2, 2023);
        System.out.println(date1);
        System.out.println(date1.equalTo(date2));
        System.out.println(date1.precede(date2));
        System.out.println(date1.leap());
        System.out.println(date1.nextDay());
    }

    public static void exercise1(double g) {
        if (40 < g) {
            System.out.println("extra strong liquor");
        } else if (20 < g) {
            System.out.println("strong liquor");
        } else if (15 < g) {
            System.out.println("liquor");
        } else if (12 < g) {
            System.out.println("strong vine");
        } else if (10.5 < g) {
            System.out.println("normal vine");
        } else {
            System.out.println("light vine");
        }
    }

    public static void exercise2(double a, double b, double c) {
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
            System.out.println("it is irregular");
        } else if (equal == 1) {
            System.out.println("it is symmetric");
        } else {
            System.out.println("it is regular");
        }
    }

    public static void exercise3(double a, double b, double c) {
        if ((a != b) && (a != c) && (b != c)) {
            System.out.println("it is irregular");
        } else if ((a == b) && (a != c) || (a == c) && (a != b) ||
                (b == c) && (a != b)) {
            System.out.println("it is symmetric");
        } else {
            System.out.println("it is regular");
        }
    }

    public static void exercise5(int a, int b, int c) {
        int discriminant = b * b - 4 * a * c;
        if (discriminant == 0) {
            System.out.println("real double soulution " + (-b / (2 * a)));
        } else if (discriminant > 0) {
            System.out.println("two distinct real solutions" +
                    (-b + Math.sqrt(discriminant)) / (2 * a) + ", " + (-b - Math.sqrt(discriminant)) / (2 * a));
        } else {
            System.out.println("two complex solutions"+
                    ((-b/(2*a)) + (Math.sqrt(-discriminant)/(2*a))) +"i, " + ((-b/(2*a)) - (Math.sqrt(-discriminant)/(2*a))) +"i"
                    );
        }
    }

    public static void exercise6(String s) {
        if (s.substring(0, 5).equals("vocal")) {
            System.out.println("MAYBE");
        } else if (s.charAt(s.length() - 1) == 'a' || s.charAt(s.length() - 1) == 'i' ||
                s.charAt(s.length() - 1) == 'u') {
            System.out.println("YES");
        } else if (s.charAt(s.length() - 1) == 'e' || s.charAt(s.length() - 1) == 'o') {
            System.out.println("NO");
        } else {
            System.out.println("DON'T KNOW");
        }
    }
}
