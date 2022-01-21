package Shop;

import Test.Car;

public class Cashier {
    private Cart cart;

    public String print(Cart cart){
        StringBuilder builder = new StringBuilder();
        Date date = new Date(2020,1,23);
        date.setHour(12);
        date.setMin(53);
        date.setSeconds(36);
       String dateOfPurchase =  String.format("Date: %d-0%d-%d  %d:%d:%d",
                date.getYear(),
                date.getMonth(),
                date.getDay(),
                date.getHour(),
                date.getMin(),
                date.getSeconds());
       builder.append(dateOfPurchase);
       builder.append(System.lineSeparator());
       builder.append("---Products---");
       builder.append(System.lineSeparator());
       builder.append(System.lineSeparator());

        Cart cart1 = new Cart();
        cart1.addProducts();
        double total = 0;
        for (Product product : cart1.getProducts()) {
            builder.append(String.format("%s - %s%n%f%n%n",product.getName(),product.getBrand(),product.getPrice()));
            total+=product.getPrice();
        }

        builder.append("-----------------------------------------------------------------------------------");
        builder.append(System.lineSeparator());
        builder.append(String.format("TOTAL: $%f",total));

        return builder.toString();







    }


}
