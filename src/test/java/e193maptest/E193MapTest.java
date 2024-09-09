package e193maptest;

import org.example.e193.E193Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E193MapTest {
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
    public void testLibraryCatalogOutput() {
        // Execute the main method from E201LibraryCatalogHashMap
        E193Map.main(new String[]{});

        // Build the expected output string
        String expectedOutput = "Initial number of books in catalog: 5" + System.lineSeparator() +
                "Is the catalog empty? false" + System.lineSeparator() +
                "Is book with ID 102 available? true" + System.lineSeparator() +
                "Is the book \"1984\" available? true" + System.lineSeparator() +
                "Updated catalog after removing ID 105:" + System.lineSeparator() +
                "101: The Catcher in the Rye" + System.lineSeparator() +
                "102: To Kill a Mockingbird" + System.lineSeparator() +
                "103: 1984" + System.lineSeparator() +
                "104: The Great Gatsby" + System.lineSeparator() +
                "Is the catalog empty after clearing? true";

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }
}