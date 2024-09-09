package e192maptest;

import org.example.e192.E192Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E192MapTest {
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
    public void testProductInventoryOutput() {
        // Execute the main method from E200ProductInventoryTreeMap
        E192Map.main(new String[]{});

        // Build the expected output string
        String expectedOutput = "Key is 1 item and value is apple" + System.lineSeparator() +
                "Key is 2 item and value is banana" + System.lineSeparator() +
                "Key is 3 item and value is pear" + System.lineSeparator() +
                "Key is 4 item and value is tomato" + System.lineSeparator() +
                "Key is 5 item and value is mango" + System.lineSeparator() +
                "Key is 6 item and value is kiwi";

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }
}