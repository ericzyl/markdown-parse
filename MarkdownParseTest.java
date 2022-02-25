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
    public void testSnippet1() throws IOException{
        String filename = "snippet1.md";
        Path path = Paths.get(filename);
        String contents = Files.readString(path);
        List<String> expected = List.of("`google.com", "google.com", "ucsd.edu");
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testSnippet2() throws IOException{
        String filename = "snippet2.md";
        Path path = Paths.get(filename);
        String contents = Files.readString(path);
        List<String> expected = List.of("a.com", "a.com(())", "example.com");
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testSnippet3() throws IOException{
        String filename = "snippet3.md";
        Path path = Paths.get(filename);
        String contents = Files.readString(path);
        List<String> expected = List.of("https://ucsd-cse15l-w22.github.io/");
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

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

        // String contents = Files.readString(Path.of("./snippet1.md"));
        // List<String> expected = List.of("https://something.com","some-page.html");
        // assertEquals(expected,MarkdownParse.getLinks(contents));
    }

    @Test
    public void testGetLinksTwo() throws IOException{
        String filename = "test-file2.md";
        //To get path of file
        Path path = Paths.get(filename);
        //To print absolute path of file
        String contents = Files.readString(path);
        List<String> expected = List.of("https://something.com", "some-page.html");
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testGetLinksThree() throws IOException{
        String filename = "test-file6.md";
        //To get path of file
        Path path = Paths.get(filename);
        //To print absolute path of file
        String contents = Files.readString(path);
        List<String> expected = List.of("page.com");
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testGetLinksFour() throws IOException{
        String filename = "test-file9.md";
        //To get path of file
        Path path = Paths.get(filename);
        //To print absolute path of file
        String contents = Files.readString(path);
        List<String> expected = List.of("https://something.com", "some-page1.html", "some-page2.html", "some-page3.html", "some-page4.html", 
        "some-page5.html","some-page6.html");
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