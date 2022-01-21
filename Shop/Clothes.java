package Shop;

public class Clothes extends Product{
    private String size;
    private String color;
    public Clothes(String name, String brand, double price,String size,String color) {
        super(name, brand, price);
        this.size = size;
        this.color = color;
    }
}
