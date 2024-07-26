package org.example.e62;

public class E62ForLoop {
    public static void main(String[] args) {
        // The same code with logical &&...
        for (int i = 1; i <= 10; i++) {
            if (i != 5 && i != 6)
                System.out.println(i);
        }
    }
}

// The same code with logical ||...
/*
        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 6) {
                continue;
            }
            System.out.println(i);
        }
    }
}
 */