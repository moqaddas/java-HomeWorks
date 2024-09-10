package e184listtest;

import org.example.e184.E184List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E184ListTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testListModification() {
        // Execute the main method to produce the output
        E184List.main(new String[]{});
        // Build the expected output string
        String expectedOutput = "[USA, Kazakhstan, Pakistan, Russia]";
        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}