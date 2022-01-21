package Shop;

public class Beverage extends Product{
    private Date expirationDate;
    public Beverage(String name, String brand, double price) {
        super(name, brand, price);
        setExpirationDate();
    }

    public void setExpirationDate() {
        this.expirationDate = new Date(2022,3,22);

    }

    public Date getExpirationDate() {
        return expirationDate;
    }
}
