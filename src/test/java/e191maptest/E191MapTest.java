package e191maptest;

import org.example.e191.E191Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E191MapTest {
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
    public void testProductCatalogOutput() {
        // Execute the main method from E199ProductCatalogLinkedHashMap
        E191Map.main(new String[]{});

        // Build the expected output string
        String expectedOutput = "Product Catalog:" + System.lineSeparator() +
                "Laptop: $1200.99" + System.lineSeparator() +
                "Smartphone: $799.99" + System.lineSeparator() +
                "Tablet: $499.99" + System.lineSeparator() +
                "Smartwatch: $199.99" + System.lineSeparator() +
                "Headphones: $149.99";

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }
}