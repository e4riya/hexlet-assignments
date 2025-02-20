package exercise;

import java.util.HashMap;
import org.junit.jupiter.api.BeforeEach;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
// BEGIN

// END


class FileKVTest {

    private static Path filepath = Paths.get("src/test/resources/file").toAbsolutePath().normalize();

    @BeforeEach
    public void beforeEach() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String content = mapper.writeValueAsString(new HashMap<String, String>());
        Files.writeString(filepath, content, StandardOpenOption.TRUNCATE_EXISTING);
    }

    // BEGIN
    @Test
    void testFileKv(){
        FileKV fileKV = new FileKV(filepath.toString(), Map.of("a","1","b","2","c","3"));
        assertEquals(fileKV.toMap(),Map.of("a","1","b","2","c","3"));
        fileKV.unset("c");
        assertEquals(fileKV.toMap(),Map.of("a","1","b","2"));
        fileKV.set("d","4");
        assertEquals(fileKV.toMap(),Map.of("a","1","b","2","d","4"));
        assertEquals(fileKV.get("a","default"),"1");

    }
    // END
}
