package e195maptest;

import org.example.e195.E195Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class E195MapTest {

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
    public void testMainMethodOutput() {
        E195Map.main(new String[]{});

        String output = outContent.toString().trim();
        List<String> outputLines = Arrays.asList(output.split(System.lineSeparator()));

        assertEquals("From Map (Students by Subject):", outputLines.get(0));
        assertEquals(4, outputLines.size());

        assertTrue(outputLines.contains("Subject: Mathematics Students: [Alice, Bob]"));
        assertTrue(outputLines.contains("Subject: Science Students: [Charlie, David]"));
        assertTrue(outputLines.contains("Subject: History Students: [Eve, Frank]"));
    }
}