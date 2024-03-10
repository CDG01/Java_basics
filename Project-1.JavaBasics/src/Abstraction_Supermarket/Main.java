package Abstraction_Supermarket;


public class Main {
    public static void main(String srgs[]){
        Items item1 = new Items("broccolo", 1.3, 0.1);
        Items item2 = new Items("soia", 3., 0.3);

        // carrello per utente che non paga IVA:
        Carts companyCart = new CartWithoutIVA(new Items[] {item1, item2});
        companyCart.printReceipt();

        // carrello per utente che paga IVA:
        Carts privateCart = new CartWithIVA(new Items[] {item1, item2});
        privateCart.printReceipt();


        // Sovrascrivo i carrelli (li aggiorno)
        Items item3 = new Items("kiwi", 1.1, 0.33);
        companyCart = new CartWithoutIVA(new Items[] {item1, item2, item3});
        companyCart.printReceipt();
        privateCart = new CartWithIVA(new Items[] {item1, item2, item3});
        privateCart.printReceipt();
    }
}
