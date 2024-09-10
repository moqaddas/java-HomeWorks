package e189settest;

import org.example.e189.E189Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E189SetTest {
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
    public void testEmailListOutput() {
        // Execute the main method from E197EmailCollectionLinkedHashSet
        E189Set.main(new String[]{});

        // Build the expected output string
        String expectedOutput = "Email List using For-Each:" + System.lineSeparator() +
                "null" + System.lineSeparator() +
                "john.doe@example.com" + System.lineSeparator() +
                "jane.smith@example.com" + System.lineSeparator() +
                "admin@event.com" + System.lineSeparator() +
                "info@company.com";

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }
}