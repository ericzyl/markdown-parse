import static org.junit.Assert.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void addition2() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinksOne() throws IOException{
        String filename = "test-file.md";
        //To get path of file
        Path path = Paths.get(filename);
        //To print absolute path of file
        String contents = Files.readString(path);
        List<String> expected = List.of("https://something.com", "some-page.html");
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testGetLinksTwo() throws IOException{
        String filename = "test-file.md";
        //To get path of file
        Path path = Paths.get(filename);
        //To print absolute path of file
        String contents = Files.readString(path);
        List<String> expected = List.of("https://something.com", "some-page.html");
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testGetLinksThree() throws IOException{
        String filename = "test-file.md";
        //To get path of file
        Path path = Paths.get(filename);
        //To print absolute path of file
        String contents = Files.readString(path);
        List<String> expected = List.of("https://something.com", "some-page.html");
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }
 
}

/**
 * try{
            String contents = Files.readString(Path.of("./test-file.md"));
            List<String> expected = List.of("https://something.com", "some-page.html");
            assertEquals(expected, MarkdownParse.getLinks(contents));
        }catch(NoSuchFileException e){
            
        }
 */