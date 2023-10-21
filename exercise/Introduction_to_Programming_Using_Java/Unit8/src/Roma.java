public class Roma {
    private int n;
    private static final int[] numbers = {1000, 900, 500, 400, 100, 90,
            50, 40, 10, 9, 5, 4, 1};
    private static final String[] letters = {"M", "CM", "D", "CD", "C", "XC",
            "L", "XL", "X", "IX", "V", "IV", "I"};

    public Roma(int number) {
        if (number < 1 || number > 3999) {
            throw new NumberFormatException("Wrong value");
        }
        n = number;
    }

    public Roma(String line) {
        if (line.length() == 0) {
            throw new NumberFormatException("Empty String");
        }
        line = line.toUpperCase();
        int i = 0, result = 0;
        while (i < line.length()) {
            char tmp = line.charAt(i);
            int number = letterToNum(tmp);
            i++;
            if (i == line.length()) {
                result += number;
            } else {
                int nextNumber = letterToNum(line.charAt(i));
                if (nextNumber > number) {
                    result += (nextNumber - number);
                    i++;
                } else {
                    result += number;
                }
            }
        }
        if(result > 3999){
            throw new NumberFormatException("Result is over 3999");
        }
        n = result;
    }

    public int toInt() {
        return n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int value = n;
        for (int i = 0; i < numbers.length; i++) {
            int tmp = numbers[i];
            while (value >= tmp) {
                sb.append(tmp);
                value -= tmp;
            }
        }
        return sb.toString();
    }

    private int letterToNum(char letter) {
        switch (letter) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new NumberFormatException(
                        "Illegal character \"" + letter + "\" in Roman numeral");
        }
    }
}
