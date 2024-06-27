package c1;

import java.util.HashMap;
import java.util.Map;

public enum Region {
	 R1("USA", 0.07, new String[]{"United States", "Canada", "Mexico"}),
	    R2("Europe", 0.15, new String[]{"United Kingdom", "Germany", "France"}),
	    R3("Asia", 0.10, new String[]{"China", "Japan", "India"}),
	    R4("Africa", 0.12, new String[]{"Nigeria", "South Africa", "Egypt"});

	   //fields
	    private final String continent;
	    private final double taxRate;
	    private final String[] countries;

	    
	    private static final Map<String, Region> countryToRegionMap = new HashMap<>();
         //static block
	    static {
	        for (Region region : Region.values()) {
	            for (String country : region.countries) {
	                countryToRegionMap.put(country.toLowerCase(), region);
	            }
	        }
	    }
         //constructor
	    Region(String continent, double taxRate, String[] countries) {
	        this.continent = continent;
	        this.taxRate = taxRate;
	        this.countries = countries;
	    }
        //methods
	    public String getContinent(){
	        return continent;
	    }

	    public double getTaxRate() {
	        return taxRate;
	    }
	    
	    public static Region getRegionByCountry(String country) {
	        return countryToRegionMap.get(country.toLowerCase());
	    }


	    public static String getDetailByCountry(String country) {
	        Region region = countryToRegionMap.get(country.toLowerCase());
	        if (region != null) {
	            return String.format("Continent: %s, Tax Rate: %.2f", region.getContinent(), region.getTaxRate());
	        } else {
	            return "country not found";
	        }
	    }

}
