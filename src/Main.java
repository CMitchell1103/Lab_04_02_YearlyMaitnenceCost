import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double springCost;
        double summerCost;
        double winterCost;
        double fallCost;

        System.out.println("What is the Spring maintenance cost: ");
            springCost = input.nextDouble();

        System.out.println("What is the Summer maintenance cost: ");
            summerCost = input.nextDouble();

        System.out.println("What is the Winter maintenance cost: ");
            winterCost = input.nextDouble();

        System.out.println("What is te Fall maintenance cost: ");
            fallCost = input.nextDouble();

        System.out.println("The maintenance costs are: ");
        System.out.println("The Summer cost is $ " + summerCost);
        System.out.println("The Winter cost is $ " + winterCost);
        System.out.println("The Fall cost is $ " + fallCost);
        System.out.println("The Spring cost is $ " + springCost);
        System.out.println("The total maintenance cost is $ " + springCost + summerCost + winterCost + fallCost);
    }
}