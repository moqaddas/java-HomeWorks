package e185settest;


import org.example.e185.E185Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E185CustomerOrdersTest {

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
    public void testUniqueCustomerIdsOutput() {
        // Execute the main method from E193CustomerOrdersHashSet
        E185Set.main(new String[]{});

        // Build the expected output string
        String expectedOutput = "1001" + System.lineSeparator() +
                                "1002" + System.lineSeparator() +
                                "1003" + System.lineSeparator() +
                                "1004";

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }
}