import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gasGallons;
        double fuelEfficiency;
        double priceOfGas;

        do {
            System.out.print("Please enter the number of gallons of gas in your tank: ");
            gasGallons = in.nextDouble();
        } while (gasGallons <= 0);

        do {
            System.out.print("Please enter the fuel efficiency in miles per gallon: ");
            fuelEfficiency = in.nextDouble();
        } while (fuelEfficiency <= 0);

        do {
            System.out.print("Please enter the price of gas per gallon: ");
            priceOfGas = in.nextDouble();
        } while (priceOfGas <= 0);

        double costPer100Miles = (100 / fuelEfficiency) * priceOfGas;
        double distance = gasGallons * fuelEfficiency;

        System.out.println("The cost to drive every 100 miles is: " + costPer100Miles);
        System.out.println("The car can go " + distance + " miles with the " + gasGallons + " gallons left in the tank");

        in.close();
        }
    }
