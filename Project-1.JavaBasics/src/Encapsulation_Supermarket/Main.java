package Encapsulation_Supermarket;

public class Main {
    public static void main(String srgs[]){
        Items item1 = new Items("broccolo", 1.3, 0.1);
        Items item2 = new Items("soia", 3., 0.3);

        Carts myHealthyCart = new Carts(new Items[] {item1, item2});
        System.out.println("Carrello attuale:" + myHealthyCart); // uso implicitamente il metodo toString()
        myHealthyCart.printReceipt();


        // Sovrascrivo il carrello
        Items item3 = new Items("kiwi", 1.1, 0.33);
        myHealthyCart = new Carts(new Items[] {item1, item2, item3});
        System.out.println("Carrello attuale:" + myHealthyCart);
        myHealthyCart.printReceipt();
    }
}
