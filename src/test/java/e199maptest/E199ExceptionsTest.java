package e199maptest;

import org.example.e199.E199Exceptions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class E199ExceptionsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testExceptionHandling() {
        // Execute the main method to produce the output
        E199Exceptions.main(new String[]{});

        // Expected output
        String expectedOutput = "Trying to access an element..." + System.lineSeparator() +
                "Error: Array index is out of bounds" + System.lineSeparator() +
                "Program has finished";

        // Check if the output matches the expected output
        assertEquals(expectedOutput, outContent.toString().trim());

    }
}