import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        var item = new ClothingItem("Shoes",ClothingSize.L, 1500,3);
        var totalprice = item.getPrice() * item.getQuantity();
        var formatted = NumberFormat.getCurrencyInstance();
        System.out.println(String.format("%d %s of size %s costs %s",
                item.getQuantity(),
                item.getType(),
                item.getSize(),
                formatted.format(totalprice)));
        var newitem = new Shirt(ClothingSize.S, 1000,3);
        var newtotalprice = newitem.getPrice() * newitem.getQuantity();
        var newformatted = NumberFormat.getCurrencyInstance();
        System.out.println(String.format("%d %s of size %s costs %s",
                newitem.getQuantity(),
                newitem.getType(),
                newitem.getSize(),
                newformatted.format(newtotalprice)));
        var newitem2 = new Hat(ClothingSize.M, 500,3);
        var newtotalprice2 = newitem2.getPrice() * newitem2.getQuantity();
        var newformatted2 = NumberFormat.getCurrencyInstance();
        System.out.println(String.format("%d %s of size %s costs %s",
                newitem2.getQuantity(),
                newitem2.getType(),
                newitem2.getSize(),
                newformatted2.format(newtotalprice2)));
    }
}
