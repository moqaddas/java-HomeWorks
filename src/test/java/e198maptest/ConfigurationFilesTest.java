package e198maptest;

import org.example.e198.ConfigurationFiles;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConfigurationFilesTest {

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
    public void testConfigManagement() {
        // Execute the main method to produce the output
        ConfigurationFiles.main(new String[]{});

        // Expected output for Config details
        String expectedOutput = "Browser: chrome" + System.lineSeparator() +
                "URL: https://www.syntaxprojects.com/" + System.lineSeparator() +
                "Implicit Wait: 10 seconds";
    }
}