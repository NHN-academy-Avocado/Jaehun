public class TextBooksOfTheFreeUniversityOfBolzano extends  Book{
    private String faculty;
    public TextBooksOfTheFreeUniversityOfBolzano(String title, String authors, String faculty) {
        super(title, authors);
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return super.toString() + ", faculty = " + faculty;
    }
}
