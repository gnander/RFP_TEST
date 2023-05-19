public class BinaryConverter {
    public static String toBinary(int decimalNumber) {
        StringBuilder binaryRepresentation = new StringBuilder();

        while (decimalNumber > 0) {
            binaryRepresentation.insert(0, decimalNumber % 2);
            decimalNumber /= 2;
        }

        while (binaryRepresentation.length() < 32) {
            binaryRepresentation.insert(0, "0");
        }

        return binaryRepresentation.toString();
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        String binaryNumber = BinaryConverter.toBinary(decimalNumber);
        System.out.println("Binary representation: " + binaryNumber);
    }
}