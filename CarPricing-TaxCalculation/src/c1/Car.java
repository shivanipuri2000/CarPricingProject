package c1;
import java.util.*;

public class Car {
   
	//field 
	private double basePrice;
    private Region region;
   
    //created a constructor
    public Car(double basePrice,String country) {
        this.basePrice = basePrice;
        this.region =Region.getRegionByCountry(country);
        
        if(this.region ==null) {
        	throw new IllegalArgumentException("Invalid country :" +country);
        }
   }
 
    //methods
    public double calculateTax() {
        return basePrice * region.getTaxRate();
    }

    public double calculateTotalPrice() {
        return basePrice + calculateTax();
    }

    public void displayInfo() {
        double tax = calculateTax();
        double totalPrice = calculateTotalPrice();
        System.out.printf("Car details:\n");
        System.out.printf("  Base Price: $%.2f\n", basePrice);
        System.out.printf("  Region: %s (%s)\n", region.name(), region.getContinent());
        System.out.printf("  Tax: $%.2f\n", tax);
        System.out.printf("  Total Price: $%.2f\n", totalPrice);
    }
	

	
}
