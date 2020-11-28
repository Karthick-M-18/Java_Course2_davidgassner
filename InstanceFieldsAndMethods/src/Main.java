import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        var item = new ClothingItems();
        item.setType("Shirts");
        item.setSize("M");
        item.setPrice(999);
        item.setQuantity(2);

        double totprice = item.getPrice() * item.getQuantity();
        var formatted = NumberFormat.getCurrencyInstance();
        System.out.println(String.format("%d %s of size %s costs %s.",item.getQuantity(),item.getType(),item.getSize(),formatted.format(totprice)));
    }
}
