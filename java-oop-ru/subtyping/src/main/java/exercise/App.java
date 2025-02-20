package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void main(String[] args) {
        KeyValueStorage kvs = new InMemoryKV(Map.of("a", "1", "b", "2"));
        System.out.println(kvs);
        swapKeyValue(kvs);
        System.out.println(kvs);
    }

    public static void swapKeyValue(KeyValueStorage keyValueStorage) {
        Map<String, String> result = new HashMap<String, String>();
        Map<String, String> map = keyValueStorage.toMap();
        for (Entry<String, String> entry : map.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }
        for (Entry<String, String> entry : result.entrySet()) {
            keyValueStorage.unset(entry.getValue());
        }
        for (Entry<String, String> entry : result.entrySet()) {
            keyValueStorage.set(entry.getKey(), entry.getValue());
        }

    }
}

// END
