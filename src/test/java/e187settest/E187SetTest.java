package e187settest;

import org.example.e187.E187Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E187SetTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        // Redirect System.out to capture the output for testing
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Restore System.out after the test
        System.setOut(originalOut);
    }

    @Test
    public void testColorSetOutput() {
        // Execute the main method from E195ColorCollectionHashSet
        E187Set.main(new String[]{});

        // Build the expected output string
        String expectedOutput = "Original Hash Set: [Red, Pink, White, Yellow, Black]" + System.lineSeparator() +
                "Size of the Hash Set: 5";

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }
}