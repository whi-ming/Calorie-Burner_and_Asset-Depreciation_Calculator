//--------------------------------------------------------
// Assignment 1 Q2
// Written by: Whi-Ming Joseph 40202164
// For COMP 248 Section W - Winter 2022
//--------------------------------------------------------
    // This program will calculate the yearly depreciation
    // of an asset in dollars and life percentage. The
    // program will also be able to calculate how many
    // it would take for the asset to reach 50% of its life.

//Import Scanner so user can input
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Declare Scanner
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Asset Depreciation Tool:");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Enter the calues (Price, Salvage value, and Years used) with a space between them:");
        int price = in.nextInt();
        int salvage = in.nextInt();
        int years = in.nextInt();

            //I do all my calculations here so later all I have to do is refer back
            //to the results I found. First I used the depreciation formula to find
            //the amount of depreciation lost in dollars.
            double yearlyDepreciationInDollars = (price - salvage)/years;

            //I take that amount and divide it with the Purchase Price and multiply
            //by 100 to find the depreciation in terms of life percentage.
            double yearlyDepreciationInPercentage = yearlyDepreciationInDollars/price * 100;

            //To find the amount of years it would take to reach 50% of its value,
            //50% should be divided by the preceding answer to find the number of years.
            double yearsUntilHalfValue = 50/yearlyDepreciationInPercentage;

        //The example showed this result only containing 1 space after the decimal point, so %.1f is needed.
        System.out.printf("Yearly depreciation = $%.1f%n", yearlyDepreciationInDollars);

        //Second example had 2 decimal spaces, so %.2f
        System.out.print("Yearly deprectiation % = ");
        System.out.printf("%.2f", yearlyDepreciationInPercentage);
        System.out.println("%");

        //Assignment instructions demanded for this to have 2 decimal spaces, so %.2f
        System.out.print("Number of years for salvage value to become 50% of purchase price = ");
        System.out.printf("%.2f", yearsUntilHalfValue);
        System.out.printf(" years%n%n");

        System.out.printf("Thank you for using Asset Depreciation Tool. %n%n");
        System.out.println("See you next time.");

            //For future projects I would round my answers right after
            //the calculations, making it easier to print out the variables without
            //having to write three lines of code for one line of text.
    }
}
