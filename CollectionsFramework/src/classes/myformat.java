package classes;

import java.text.NumberFormat;

public class myformat {
    public static void myformat(ClothingItems item) {
        var formatted = NumberFormat.getCurrencyInstance();
        var totalprice = item.getPrice() * item.getQuantity();
        System.out.println(String.format("%d %s of size %s costs %s",
                item.getQuantity(),
                item.getType(),
                item.getSize(),
                formatted.format(totalprice)));
    }
}

