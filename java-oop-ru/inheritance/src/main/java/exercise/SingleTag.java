package exercise;



import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
public class SingleTag extends Tag {
    public SingleTag(String name, Map<String, String> attributes) {
        super(name, attributes);
    }
    @Override
    public String toString() {
        String preResult = attributes.entrySet().stream()
                .map(entry -> " " + entry.getKey() + "=\"" + entry.getValue() + "\"")
                .collect(Collectors.joining(""));
        return "<" + name + preResult + ">";
    }

}
// END
