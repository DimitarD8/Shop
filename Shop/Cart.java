package Shop;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products = new ArrayList<>();



    public List<Product> addProducts(){
        Product food = new Food("Apple","BrandA",1.50);
        Product beverage = new Beverage("Mil","BrandB",1.09);
        Product clothes = new Clothes("T-shirt","BrandC",15.63,"M","red");
        Product appliance = new Appliance("Laptop","BrandD",1001,"Model",new Date(2019,11,25),1.063);

        this.products.add(food);
        this.products.add(beverage);
        this.products.add(clothes);
        this.products.add(appliance);

        return this.products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }
}
