package e195maptest;


import org.example.e195.E195Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E195MapTest {

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
    public void testHashMapOutput() {
        // Execute the main method to produce the output
        E195Map.main(new String[]{});

        // Expected output for HashMap
        String expectedOutput = "From HashMap (Employee IDs and Salaries):" + System.lineSeparator() +
                "ID: 1001 Salary: 50000.0" + System.lineSeparator() +
                "ID: 1002 Salary: 60000.0" + System.lineSeparator() +
                "ID: 1003 Salary: 55000.0" + System.lineSeparator() +
                "ID: 1004 Salary: 70000.0" + System.lineSeparator() +
                "ID: 1005 Salary: 65000.0";

        // Check if the output for HashMap matches the expected output
        assertEquals(expectedOutput, outContent.toString().trim().split(System.lineSeparator())[0] +
                System.lineSeparator() +
                outContent.toString().trim().split(System.lineSeparator())[1] +
                System.lineSeparator() +
                outContent.toString().trim().split(System.lineSeparator())[2] +
                System.lineSeparator() +
                outContent.toString().trim().split(System.lineSeparator())[3] +
                System.lineSeparator() +
                outContent.toString().trim().split(System.lineSeparator())[4] +
                System.lineSeparator() +
                outContent.toString().trim().split(System.lineSeparator())[5]);
    }

    @Test
    public void testLinkedHashMapOutput() {
        // Expected output for LinkedHashMap
        String expectedOutput = "From LinkedHashMap (Website Visit History):" + System.lineSeparator() +
                "Page: home.html Visit Time: 12:00" + System.lineSeparator() +
                "Page: about.html Visit Time: 12:05" + System.lineSeparator() +
                "Page: products.html Visit Time: 12:10" + System.lineSeparator() +
                "Page: contact.html Visit Time: 12:15";

        // Split the content and assert for LinkedHashMap part
        String[] lines = outContent.toString().split(System.lineSeparator());
        String linkedHashMapOutput = lines[6] + System.lineSeparator() +
                lines[7] + System.lineSeparator() +
                lines[8] + System.lineSeparator() +
                lines[9] + System.lineSeparator() +
                lines[10];
        assertEquals(expectedOutput, linkedHashMapOutput);
    }

    @Test
    public void testTreeMapOutput() {
        // Expected output for TreeMap
        String expectedOutput = "From TreeMap (Product Codes and Prices):" + System.lineSeparator() +
                "Code: P001 Price: 10.99" + System.lineSeparator() +
                "Code: P002 Price: 11.99" + System.lineSeparator() +
                "Code: P003 Price: 12.49" + System.lineSeparator() +
                "Code: P010 Price: 15.99";

        // Split the content and assert for TreeMap part
        String[] lines = outContent.toString().split(System.lineSeparator());
        String treeMapOutput = lines[11] + System.lineSeparator() +
                lines[12] + System.lineSeparator() +
                lines[13] + System.lineSeparator() +
                lines[14] + System.lineSeparator() +
                lines[15];
        assertEquals(expectedOutput, treeMapOutput);
    }
}
