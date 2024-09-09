package org.example.e196;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E196Map {

    public static void main(String[] args) {
        // Step 1: Create a Map of Lists to store department and employee data
        Map<String, List<String>> departmentEmployees = new HashMap<>();

        // Step 2: Add department and employee data
        departmentEmployees.put("HR", Arrays.asList("Alice", "Bob"));
        departmentEmployees.put("IT", Arrays.asList("Charlie", "David", "Eve"));
        departmentEmployees.put("Finance", Arrays.asList("Frank", "Grace"));

        // Step 3: Print departments and employees
        System.out.println("Departments and Employees:");
        for (Map.Entry<String, List<String>> entry : departmentEmployees.entrySet()) {
            System.out.println("Department: " + entry.getKey() + " Employees: " + entry.getValue());
        }
    }

}
