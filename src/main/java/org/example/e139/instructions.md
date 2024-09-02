# Exercise: Replacing Spaces with Underscores in a String

## Objective
Learn how to create a method in Java that replaces all spaces in a string with underscores, while applying different access modifiers to control the visibility and accessibility of the method.

## Instructions

**Creating a Method to Replace Spaces with Underscores**

In this project, you will create a method that takes a string and replaces every space with an underscore, while applying different access modifiers to observe how they affect access to the method from different parts of the project.

### Steps for You to Do:

1. **Declare Method with Access Modifiers:**
    - Create a method with the following specifications:
        - **Returns:** a String
        - **Name:** `replaceSpaces`
        - **Parameters:** a String called `str`
        - **Purpose:** The method will return a new string where all spaces are replaced with underscores.
        - **Apply different access modifiers** to the method (private, default, protected, public) and observe the behavior when accessing the method from other classes.

2. **Method Logic:**
    - Inside the method, use a string manipulation method to replace every space (' ') in the string with an underscore ('_').

3. **Main Method:**
    - In the main method, call the `replaceSpaces` method with simple string inputs and print the results.
    - Experiment with different access modifiers (private, default, protected, public) to observe how they affect access to the method when calling it from another class.

### Example InputOutput:

- `replaceSpaces("hello world")` ==> "hello_world"
  `replaceSpaces("java is fun")` ==> "java_is_fun"
  `replaceSpaces("i love coding")` ==> "i_love_coding"

### Expected Output:

- ```
  hello_world
  ```
  ```
  java_is_fun
  ```
  ```
  i_love_coding
  ```

### Purpose:

- The `replaceSpaces` method helps you practice simple string manipulation by replacing spaces with underscores while understanding how access modifiers control method accessibility from different parts of a project.

## Tips:
- Use the String class's replace method to easily replace all spaces with underscores.
- Experiment with different access modifiers (private, default, protected, public) and try to call the method from different classes to understand how each modifier affects access.

## Troubleshooting:
- If the output doesn't match the expected result, ensure that you're correctly replacing spaces with underscores in the string.
- If you encounter access errors, verify that the correct access modifier is being applied to the method, and consider where the method is being accessed from.

By completing this exercise, you will practice both basic string manipulation and how to use access modifiers in Java to control method visibility. Happy coding!
