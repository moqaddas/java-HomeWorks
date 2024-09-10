package e196maptest;

import org.example.e196.E196Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class E196MapTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testMainMethodOutput() {
        E196Map.main(new String[]{});

        // Get the console output
        String output = outContent.toString().trim();

        // Check for the presence of expected content
        assertTrue(output.contains("Department: HR Employees: [Alice, Bob]"));
        assertTrue(output.contains("Department: IT Employees: [Charlie, David, Eve]"));
        assertTrue(output.contains("Department: Finance Employees: [Frank, Grace]"));


        assertTrue(output.contains("HR"));
        assertTrue(output.contains("IT"));
        assertTrue(output.contains("Finance"));

        assertTrue(output.contains("All Employees:"));
        assertTrue(output.contains("Alice"));
        assertTrue(output.contains("Bob"));
        assertTrue(output.contains("Charlie"));
        assertTrue(output.contains("David"));
        assertTrue(output.contains("Eve"));
        assertTrue(output.contains("Frank"));
        assertTrue(output.contains("Grace"));


    }
}