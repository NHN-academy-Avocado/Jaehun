import java.util.ArrayList;

public class Unit7_6 {
    public static void main(String[] args) {
        try {
            if (TextIO.readUserSelectedFile() == false) {
                System.out.println("No input file selected.  Exiting.");
                System.exit(1);
            }
            ArrayList<String> wordList = new ArrayList<>();
            String word = readNextWord();
            while (word != null) {
                word = word.toLowerCase();  // convert word to lower case
                if (wordList.indexOf(word) == -1) {
                    // This is a new word, so add it to the list
                    wordList.add(word);
                }
                word = readNextWord();
            }
            System.out.println("Number of different words found in file:  "
                    + wordList.size());
            System.out.println();
            if (wordList.size() == 0) {
                System.out.println("No words found in file.");
                System.out.println("Exiting without saving data.");
                System.exit(0);
            }
            selectionSort(wordList);
            TextIO.writeUserSelectedFile(); // If user cancels, output automatically
            // goes to standard output.
            TextIO.putln(wordList.size() + " words found in file:\n");
            for (String w : wordList) {
                TextIO.putln("   " + w);
            }
            System.out.println("\n\nDone.\n\n");
        } catch (Exception e) {
            System.out.println("Sorry, an error has occurred.");
            System.out.println("Error Message:  " + e.getMessage());
        }

    }

    public static void selectionSort(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int index = i;
            for (int j = i + 1; j < list.size(); j++) {
                String check = list.get(j);
                if (check.compareTo(list.get(index)) < 0) {
                    index = j;
                }
            }
            String tmp = list.get(i);
            list.set(i, list.get(index));
            list.set(index, tmp);
        }
    }

    private static String readNextWord() {
        char ch = TextIO.peek();
        while (ch != TextIO.EOF && !Character.isLetter(ch)) {
            TextIO.getAnyChar();
            ch = TextIO.peek();
        }
        if (ch == TextIO.EOF) {
            return null;
        }
        String word = "";
        while (true) {
            word += TextIO.getAnyChar();
            ch = TextIO.peek();
            if (ch == '\'') {
                TextIO.getAnyChar();
                ch = TextIO.peek();
                if (Character.isLetter(ch)) {
                    word += "\'" + TextIO.getAnyChar();
                    ch = TextIO.peek();
                } else {
                    break;
                }
            }
            if (!Character.isLetter(ch)) {
                break;
            }
        }
        return word;
    }
}
