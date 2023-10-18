public class TextBooks extends Book{
    private String course;
    public TextBooks(String title, String authors, String course) {
        super(title, authors);
        this.course = course;
    }

    @Override
    public String toString() {
        return super.toString() + ", course =" + course;
    }
}
