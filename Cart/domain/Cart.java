package domain;

import model.Product;

public class Cart {
    private Storage storage;
    private double tva = 0.2;

    // avec l'interface vous pouvez changer de storage si vos storages implémentent
    // l'interface Storage bien sur
    public Cart(Storage storage) {
        this.storage = storage;
    }

    public void buy(Product product, int quantity) {
        // logique métier
        double t = product.getPrice() * quantity * (1 + tva);

        // storage
        this.storage.set(product.getName(), t);
    }

    public double total() {
        return this.storage.total();
    }

    public void reset() {
        this.storage.reset();
    }
}
