import static org.junit.Assert.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
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
        try{
            String contents = Files.readString(Path.of("./test-file.md"));
            List<String> expected = List.of("https://something.com", "some-page.html");
            assertEquals(expected, MarkdownParse.getLinks(contents));
        }catch(NoSuchFileException e){
            
        }

    }

    @Test
    public void testGetLinksTwo() throws IOException{
        try{
            String contents = Files.readString(Path.of("./test-file.md"));
            List<String> expected = List.of("https://something.com", "some-page.html");
            assertEquals(expected, MarkdownParse.getLinks(contents));
        }catch(NoSuchFileException e){
            
        }
    }

    @Test
    public void testGetLinksThree() throws IOException{
        try{
            String contents = Files.readString(Path.of("./test-file.md"));
            List<String> expected = List.of("https://something.com", "some-page.html");
            assertEquals(expected, MarkdownParse.getLinks(contents));
        }catch(NoSuchFileException e){
            
        }
    }
 
}