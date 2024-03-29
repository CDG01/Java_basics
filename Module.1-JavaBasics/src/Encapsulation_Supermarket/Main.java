package Encapsulation_Supermarket;





public class Main {
    public static void main(String srgs[]){
        Items item1 = new Items("broccolo", 1.3, 0.1, Category.OrtaggiFrutti);
        Items item2 = new Items("soia", 3., 0.3, Category.Legumi);

        Carts myHealthyCart = new Carts(new Items[] {item1, item2});
        myHealthyCart.printReceipt();


        // Sovrascrivo il carrello (lo aggiorno)
        Items item3 = new Items("kiwi", 1.1, 0.33, Category.OrtaggiFrutti);
        myHealthyCart = new Carts(new Items[] {item1, item2, item3});
        myHealthyCart.printReceipt();
    }
}
