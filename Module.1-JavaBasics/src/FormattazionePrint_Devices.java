public class FormattazionePrint_Devices {

    static int itemId = 123;

    static String deviceType = "smartphone";
    static float sellingPrice = 3.3f;

    public static void main(String[] args) {
        printCharacteristicsForStaff();
    }

    public static void printCharacteristicsForStaff() {
        System.out.printf("------------------------------------------------------------%n");
        System.out.printf("                   Caratteristiche tecniche:                %n");
        System.out.printf("------------------------------------------------------------%n");
        System.out.printf("| %-30s | %20d |%n", "ID", itemId);
        System.out.printf("| %-30s | %20s |%n", "Tipo di dispositivo", deviceType);
        System.out.printf("| %-30s | %20.2f |%n", "Prezzo di Vendita al cliente", sellingPrice);
    }

}


/*
I formatted the Java printf table according to the following rules:

- Dashed lines act as row separators.
- Pipelines separate columns.
- Each cell have a single space of padding on the left and right.
- The first column is 30 spaces wide, plus padding.
- The second column is 20 spaces wide, plus padding.
 */