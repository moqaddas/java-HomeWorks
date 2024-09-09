package e194maptest;

import org.example.e194.E194Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E194MapTest {
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
    public void testStudentDatabaseOutput() {
        // Execute the main method from E202StudentDatabaseHashMap
        E194Map.main(new String[]{});

        // Build the expected output string
        String expectedOutput = "Student IDs:" + System.lineSeparator() +
                "Student ID: 101" + System.lineSeparator() +
                "Student ID: 102" + System.lineSeparator() +
                "Student ID: 103" + System.lineSeparator() +
                "Student ID: 104" + System.lineSeparator() +
                "Student ID: 105" + System.lineSeparator() +
                System.lineSeparator() +
                "Student Names:" + System.lineSeparator() +
                "Student Name: John" + System.lineSeparator() +
                "Student Name: Emily" + System.lineSeparator() +
                "Student Name: Michael" + System.lineSeparator() +
                "Student Name: Sarah" + System.lineSeparator() +
                "Student Name: David" + System.lineSeparator() +
                System.lineSeparator() +
                "Student Records:" + System.lineSeparator() +
                "Student ID: 101, Student Name: John" + System.lineSeparator() +
                "Student ID: 102, Student Name: Emily" + System.lineSeparator() +
                "Student ID: 103, Student Name: Michael" + System.lineSeparator() +
                "Student ID: 104, Student Name: Sarah" + System.lineSeparator() +
                "Student ID: 105, Student Name: David";

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }
}