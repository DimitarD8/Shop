package Shop;

public class Main {
    public static void main(String[] args) {


        Cashier cashier = new Cashier();
        Cart cart = new Cart();
        System.out.println(cashier.print(cart));
    }
}
