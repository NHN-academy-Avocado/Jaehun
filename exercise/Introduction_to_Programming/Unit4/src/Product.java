public class Product {
    private final String name;
    private int count;

    public Product(String name) {
        this.name = name;
        this.count = 0;
    }
    public void downLoad(int count){
        this.count+=count;
    }
    public void  upLoad(int count){
        this.count-=count;
    }

    @Override
    public String toString() {
        return name + ", " + count + " pieces";
    }
}
