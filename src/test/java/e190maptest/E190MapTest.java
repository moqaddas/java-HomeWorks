package e190maptest;

import org.example.e190.E190Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E190MapTest {


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
    public void testAddressOutput() {
        // Execute the main method from E198AddressLinkedHashMap
        E190Map.main(new String[]{});

        // Build the expected output string
        String expectedOutput = "Address Details:" + System.lineSeparator() +
                "Patrick ST" + System.lineSeparator() +
                "265" + System.lineSeparator() +
                "Vienna" + System.lineSeparator() +
                "22180" + System.lineSeparator() +
                "United States";

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }

}
