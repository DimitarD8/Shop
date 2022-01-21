package Shop;

public class Food extends Product{
    private Date expirationDate;
    public Food(String name, String brand, double price) {
        super(name, brand, price);
        setExpirationDate();

    }

    public void setExpirationDate() {
        this.expirationDate = new Date(2022,15,14);

    }

    public Date getExpirationDate() {
        return expirationDate;
    }
}
