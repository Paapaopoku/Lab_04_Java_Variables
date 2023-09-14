public class Main
{
    public static void main(String[] args)
    {
        // intOperandA, intOperandB, intSum, intProduct, intDifference, intQuotient, intModulo
        int  intOperandA = 1;
        int intOperandB = 6;
        int intSum = 0;
        int intProduct = 8;
        int intDiffernce = 9;
        int intQuotient = 10;
        int intModulo = 11;




        intSum = intOperandA + intOperandB;
        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        // rest of the int statement go here

        double doubleOperandA = 20;
        double doubleOperandB = 7;
        double doubleSum = doubleOperandA + doubleOperandB;

        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum );

        int numKids = 6;
        boolean isRaining = false;
        double pricePerGallon = 4.25;
        String favColor = "blue";
        double shoeSize = 10;
        int birthmonth = 7;
        String fullName = "Kwabena Opokukesse";

        System.out.println("You have " + numKids + " kids ");
        System.out.println("Is it raining? = " + isRaining);
        System.out.println("The price per gallon is " + pricePerGallon);
        System.out.println("Your favorite color is " + favColor);
        System.out.println("Your shoe size is " + shoeSize);
        System.out.println("Your birth month number is " + birthmonth);
        System.out.println("Your name is " + fullName);
    }
}