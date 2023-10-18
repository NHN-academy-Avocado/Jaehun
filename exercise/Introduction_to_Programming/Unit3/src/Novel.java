public class Novel extends Book{
    private String type;
    public Novel(String title, String authors, String type) {
        super(title, authors);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", type = " + type;
    }
}
