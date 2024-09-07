# Exercise: Managing Unique Email Addresses Using LinkedHashSet

## Objective
Learn how to use a `LinkedHashSet` in Java to store unique email addresses and prevent duplicates from being added. You will also learn how to iterate through the collection using both a `for-each` loop and an `Iterator`.

## Instructions

**Step 1: Create a LinkedHashSet to Store Email Addresses**

1. **Create the `E189Set.java` class** with the following:
    - **LinkedHashSet Initialization:**
        - Initialize a `LinkedHashSet<String>` to store email addresses, which will preserve the order in which they were added and ensure that duplicates are not stored.

**Step 2: Add Email Addresses to the LinkedHashSet**

1. **Add the following email addresses to the LinkedHashSet**:
    - Add `null`, `"john.doe@example.com"`, `"jane.smith@example.com"`, `"john.doe@example.com"` (duplicate), `"admin@event.com"`, and `"info@company.com"`.
    - **Explanation:** A `LinkedHashSet` allows one `null` value, maintains insertion order, and prevents duplicate entries. If a user attempts to register multiple times with the same email, only the first entry will be kept.

**Step 3: Print Email Addresses Using a For-Each Loop**

1. **Use a for-each loop** to iterate through the `LinkedHashSet` and print the email addresses one by one.

**Step 4: Print Email Addresses Using an Iterator**

1. **Use an `Iterator`** to iterate through the `LinkedHashSet` and print the email addresses one by one.

## Example InputOutput:

**Output:**

```plaintext
null
john.doe@example.com
jane.smith@example.com
admin@event.com
info@company.com
null
john.doe@example.com
jane.smith@example.com
admin@event.com
info@company.com
```

## Why Use a LinkedHashSet for Email Collection?

- **Order Preservation:** The order in which email addresses are registered may be important for tracking purposes, so `LinkedHashSet` ensures that this order is preserved.
- **No Duplicates:** It’s essential to avoid sending duplicate invites or notifications to the same email address. The `LinkedHashSet` ensures that each email address is stored only once, even if it’s added multiple times.

Happy coding!