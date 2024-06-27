package c1;
import java.util.Scanner;


public class Main {
    public static void main(String[]args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a country name: ");
        
        String country = scanner.nextLine();

        try {
            Car car = new Car(30000, country); // Example base price, replace with actual input if available

            car.displayInfo();
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating car: " + e.getMessage());
        }

        System.out.println("\nDetails for " + country + ":");
        System.out.println(Region.getDetailByCountry(country));

        scanner.close();
    }

    	 

}









