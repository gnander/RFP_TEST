import java.util.Scanner;

public class Binary {
    public static String toBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

    public static int swapNibbles(int number) {
        int lowerNibble = number & 0x0F;
        int upperNibble = number & 0xF0;
        return (lowerNibble << 4) | (upperNibble >> 4);
    }

    public static boolean isPowerOfTwo(int number) {
        return (number != 0) && ((number & (number - 1)) == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int decimalNumber = scanner.nextInt();
        String binaryNumber = toBinary(decimalNumber);
        System.out.println("Binary representation: " + binaryNumber);

        int swappedNumber = swapNibbles(decimalNumber);
        System.out.println("Swapped number: " + swappedNumber);

        boolean isPowerOfTwo = isPowerOfTwo(decimalNumber);
        System.out.println(isPowerOfTwo);
    }
}
