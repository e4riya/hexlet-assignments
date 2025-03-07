package exercise;

import lombok.AllArgsConstructor;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
@AllArgsConstructor
public abstract class Tag{
    protected String name;
    protected Map<String, String> attributes = new LinkedHashMap<>();
}
// END
