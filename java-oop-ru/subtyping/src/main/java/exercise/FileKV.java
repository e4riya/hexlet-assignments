package exercise;

import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage{
    private String path;
    public FileKV(String path, Map<String, String> map){
        Utils.writeFile(path,Utils.serialize(map));
        this.path = path;
    }

    @Override
    public void set(String key, String value) {
        Map<String, String> map = toMap();
        map.put(key, value);
        Utils.writeFile(path,Utils.serialize(map));
    }

    @Override
    public void unset(String key) {
        Map<String, String> map = toMap();
        map.remove(key);
        Utils.writeFile(path,Utils.serialize(map));
    }

    @Override
    public String get(String key, String defaultValue) {
        return toMap().getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return Utils.deserialize(Utils.readFile(path));
    }
}
// END
