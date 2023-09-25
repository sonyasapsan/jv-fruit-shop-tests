package fruitshop.storage;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    private static Map<String, Integer> storage = new HashMap<>();

    public static Map<String, Integer> getStorage() {
        return storage;
    }

    public static void setStorage(Map<String, Integer> storage) {
        Storage.storage = storage;
    }
}
