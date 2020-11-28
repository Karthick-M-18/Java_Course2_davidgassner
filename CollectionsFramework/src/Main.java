import classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ClothingItems> items = new ArrayList<>();
        items.add(new ClothingItems("Shoes", ClothingSize.L, 1500, 3));
        items.add(new Shirt(ClothingSize.S, 1000, 3));
        items.add(new Hat(ClothingSize.M, 500, 3));
        for (ClothingItems item : items) {
            myformat.myformat(item);
        }
    }
}