//--------------------------------------------------------
// Assignment 1 Q1
// Written by: Whi-Ming Joseph 40202164
// For COMP 248 Section W - Winter 2022
//-----------------------------------------------------
    // This program will calculate and output the calories
    // burned for each activity as well as the total number
    // of calories burned.

//Import Scanner so user can input
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Declare Scanner
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Calories Burned Calculator:");
        System.out.println("--------------------------------------------------------------------");

        System.out.println("Please enter your weight in pounds:");
        System.out.println();
        int weightInPounds = in.nextInt();

        System.out.print("Running time(minutes): ");
        int runningTime = in.nextInt();

        System.out.print("Walking time(minutes): ");
        int walkingTime = in.nextInt();

        System.out.print("Mountain Climbers time(minutes): ");
        int mountainTime = in.nextInt();
        System.out.println();

            //First I'll list the constants.
            final int runningMet = 10;
            final int walkingMet = 4;
            final int mountainMet = 8;
            final double kgInPounds = 2.2;

            //Since the formula needs the weight in kg, conversion is needed.
            double weightInKg = weightInPounds / kgInPounds;

            //Calculating Calories lost per minute in each activity based on the user's weight using formula.
            //Once found, answer will have to be multiplied by the time the user had entered to find the total calories lost.
            double caloriesLostPerMinuteRunning = 0.0175 * runningMet * weightInKg;
            double totalCaloriesLostRunning = caloriesLostPerMinuteRunning * runningTime;

            double caloriesLostPerMinuteWalking = 0.0175 * walkingMet * weightInKg;
            double totalCaloriesLostWalking = caloriesLostPerMinuteWalking * walkingTime;

            double caloriesLostPerMinuteMountain = 0.0175 * mountainMet * weightInKg;
            double totalCaloriesLostMountain = caloriesLostPerMinuteMountain * mountainTime;

        System.out.println(" You burned an estimated " + totalCaloriesLostRunning + " Calories Running,");
        System.out.println(" burned an estimated " + totalCaloriesLostWalking + " Calories Walking, and");
        System.out.println(" burned an estimated " + totalCaloriesLostMountain + " Calories while doing Mountain Climbers.");
        System.out.println();

            //Sum of all the calories lost per exercise is needed to find the total of calories lost.
            double totalCaloriesBurned = totalCaloriesLostRunning + totalCaloriesLostWalking + totalCaloriesLostMountain;
        //Since the format of the total holds only one space after the decimal, "%.1f" is needed.
        System.out.printf("Total calories burned = %.1f", totalCaloriesBurned);
        System.out.printf("%n%n");

        System.out.printf("Keep up your hard work. Your progress is amazing!%nThank you for using Calories Burned Calculator.%n%nSee you soon...");

    }
}
