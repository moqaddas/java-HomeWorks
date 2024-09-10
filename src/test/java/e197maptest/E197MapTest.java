package e197maptest;


import org.example.e197.E197Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class E197MapTest {

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
    public void testDogManagement() {
        // Execute the main method to produce the output
        E197Map.main(new String[]{});

        // Expected output for Dog details
        String expectedOutput = "Dog ID: 1, Details: Dog{name='Max', breed='Labrador', age=5}" + System.lineSeparator() +
                "Dog ID: 2, Details: Dog{name='Bella', breed='Beagle', age=3}" + System.lineSeparator() +
                "Dog ID: 3, Details: Dog{name='Rocky', breed='Bulldog', age=4}";

        // Check if the output matches the expected output
        assertEquals(expectedOutput, outContent.toString().trim());

    }
}