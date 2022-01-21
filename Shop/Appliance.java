package Shop;

public class Appliance extends Product {
    private String model;
    private Date productionDate;
    private double weight;

    public Appliance(String name, String brand, double price, String model, Date productionDate, double weight) {
        super(name, brand, price);
        this.model = model;
        this.productionDate = productionDate;
        this.weight = weight;
        if (price>999){
            setPrice(price *= 0.1);
        }

    }

    private double discount() {
        if (getPrice() > 999) {
            setPrice(getPrice() * 0.1);
        }
        return getPrice();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
