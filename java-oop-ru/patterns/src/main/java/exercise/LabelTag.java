package exercise;

import lombok.AllArgsConstructor;

// BEGIN
@AllArgsConstructor
public class LabelTag implements TagInterface{
    private String tag;
    private TagInterface value;

    @Override
    public String render() {
        return "<label>" + tag + value.render() + "</label>";
    }
}
// END
