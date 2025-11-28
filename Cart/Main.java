
import domain.Cart;
import domain.Storage;
import storage.*;
import model.Product;

public class Main {

    public static void main(String[] args) {
        Storage storage = new ListStorage();
        Cart cart = new Cart(storage);

        Product apple = new Product("apple", 0.5);
        Product orange = new Product("orange", 0.7);

        cart.buy(apple, 10);
        cart.buy(apple, 10);
        cart.buy(orange, 1);
        cart.buy(orange, 1);

        System.out.println(cart.total());

        cart.reset();
        System.out.println(cart.total());
    }

}
