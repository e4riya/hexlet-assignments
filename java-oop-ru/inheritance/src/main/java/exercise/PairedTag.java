package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String value;
    private List<Tag> childs;

    public PairedTag(String name, Map<String, String> attributes, String value, List<Tag> childs) {
        super(name, attributes);
        this.value = value;
        this.childs = childs;
    }
    @Override
    public String toString() {
        String attributes = this.attributes.entrySet().stream()
                .map(entry -> " " + entry.getKey() + "=\"" + entry.getValue() + "\"")
                .collect(Collectors.joining(""));
        String tags = childs.stream()
                .map(child -> child.toString())
                .collect(Collectors.joining(""));
        return "<" + name + attributes + ">" + value + tags + "</" + name + ">";
    }
}
// END
