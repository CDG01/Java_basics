package Abstraction_Supermarket;

public class CartWithIVA extends Carts{

    public CartWithIVA(Items[] items) {
        super(items);
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0.0;

        // calcolo prezzo totale in base al contenuto del carrello e alla richiesta di prezzo con o senza iva
        for (Items item : getItems()) {
            totalPrice += item.getPrice(true);
        }

        return totalPrice;
    }


}
