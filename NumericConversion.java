import java.util.Scanner;

public class NumericConversion {
        //Converts hexadecimal strings to its value
    public static long hexStringDecode(String hex) {
        long hexi = 0;
        if (hex.startsWith("0x")) {
            hex = hex.substring(2);
        }
        for (int h = 0; h < hex.length(); h++) {
            short decode = hexCharDecode(hex.charAt(h));
            hexi = (long) (hexi + decode * Math.pow(16, hex.length() - 1 - h));
        }
        return hexi;
    }
        //Converts one digit and returns its value
    public static short hexCharDecode(char digit) {
        short hexi = 0;
        digit = Character.toUpperCase(digit);
        if (digit == '0') {
            hexi = 0;
        } else if (digit == '1') {
            hexi = 1;
        } else if (digit == '2') {
            hexi = 2;
        } else if (digit == '3') {
            hexi = 3;
        } else if (digit == '4') {
            hexi = 4;
        } else if (digit == '5') {
            hexi = 5;
        } else if (digit == '6') {
            hexi = 6;
        } else if (digit == '7') {
            hexi = 7;
        } else if (digit == '8') {
            hexi = 8;
        } else if (digit == '9') {
            hexi = 9;
        //Digits past 0-9 (A-F)
        } else if (digit == 'A') {
            hexi = 10;
        } else if (digit == 'B') {
            hexi = 11;
        } else if (digit == 'C') {
            hexi = 12;
        } else if (digit == 'D') {
            hexi = 13;
        } else if (digit == 'E') {
            hexi = 14;
        } else if (digit == 'F') {
            hexi = 15;
        }
        return hexi;
    }
        //Converts binary string into a value
    public static short binaryStringDecode(String binary) {
        short hexi = 0;
        if (binary.startsWith("0b")) {
            binary = binary.substring(2);
        }
        for (int h = 0; h < binary.length(); h++) {
            short decode = hexCharDecode(binary.charAt(h));
            hexi = (short) (hexi + decode * Math.pow(2, binary.length() - 1 - h));
        }
        return hexi;
    }
        //Main method
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //Variables
        double option = 0;
        String string1;

        //Start menu
        while (option != 4) {
            System.out.println("\nDecoding Menu\n-------------");
            System.out.println("1. Decode hexadecimal\n2. Decode binary\n3. Convert binary to hexadecimal\n4. Quit\n");
            System.out.print("Please enter an option: ");
            option = scnr.nextInt();
            if (option == 1) {
                System.out.print("Please enter the numeric string to convert: ");
                string1 = scnr.next();
                System.out.print("Result: " + hexStringDecode(string1));
            } else if (option == 2) {
                System.out.print("Please enter the numeric string to convert: ");
                string1 = scnr.next();
                System.out.print("Result: " + binaryStringDecode(string1));
            } else if (option == 3) {
                System.out.print("Please enter the numeric string to convert: ");
            //Exit option
            } else if (option == 4) {
                System.out.println("Goodbye!");
                System.exit(0);
            }
        }
    }
}
