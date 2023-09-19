public class Main {
    public static void main(String[] args) {
        int intOperandA, intOperandB, intSum, intProduct, intDifference, intQuotient, intModulo;

        intOperandA = 1;
        intOperandB = 5;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB; // 0, as an int cant hold fractions and instead rounds up/down
        System.out.println("The quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        double doubleOperandA, doubleOperandB, doubleSum, doubleProduct, doubleDifference, doubleQuotient, doubleModulo;

        doubleOperandA = 1.2;
        doubleOperandB = 2.4;

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The modulo of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);

        int numKidsInFamily = 2;
        String isItRaining = "yes";
        double gasPricePerGallon = 3.6;
        int favoriteNumber = 42;
        int shoeSize = 10;
        int birthMonth = 1;
        String fullName = "Jordan Yates";

        System.out.println("Hello world!");
    }
}