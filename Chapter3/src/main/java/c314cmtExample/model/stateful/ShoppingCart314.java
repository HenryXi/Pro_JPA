package c314cmtExample.model.stateful;

import java.util.Map;

public interface ShoppingCart314 {
    public void addItem(String id, Integer quantity);
    public Map<String, Integer> getItems();
    public void cancel();
}

