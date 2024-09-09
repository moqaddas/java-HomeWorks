package e196maptest;

import org.example.e195.E195Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E196MapTest {

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
    public void testStudentsBySubjectOutput() {
        // Execute the main method to produce the output
        E195Map.main(new String[]{});

        // Expected output for Map of List (Students by Subject)
        String expectedOutput = "Subject: Mathematics Students: [Alice, Bob]" + System.lineSeparator() +
                "Subject: Science Students: [Charlie, David]" + System.lineSeparator() +
                "Subject: History Students: [Eve, Frank]";

        // Check if the output matches the expected output
        assertEquals(expectedOutput, outContent.toString().trim());
    }

}
