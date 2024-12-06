 // Method to check if the password meets the criteria
 public static boolean isValidPassword(String password) {
    // Check if the password is at least 8 characters long
    if (password.length() < 8) {
        return false;
    }

    boolean hasUppercase = false;
    boolean hasDigit = false;

    // Check if the password contains at least one uppercase letter and one digit
    for (int i = 0; i < password.length(); i++) {
        char ch = password.charAt(i);
        if (Character.isUpperCase(ch)) {
            hasUppercase = true;
        }
        if (Character.isDigit(ch)) {
            hasDigit = true;
        }
    }

    // The password is valid if it contains at least one uppercase letter and one digit
    return hasUppercase && hasDigit;
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String password;

    // Keep asking for password input until a valid one is provided
    while (true) {
        System.out.print("Enter your password: ");
        password = scanner.nextLine();

        // Validate the password
        if (isValidPassword(password)) {
            System.out.println("Password is valid!");
            break; // Exit the loop if the password is valid
        } else {
            System.out.println("Password is invalid. It must be at least 8 characters long, contain a number, and include an uppercase letter.");
        }
    }

    scanner.close(); // Close the scanner
}
}