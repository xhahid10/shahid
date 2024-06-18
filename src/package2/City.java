package package2;

public class City extends State {
	
	
  public void cityName() {
	
	  System.out.println("The city name is Mumbai");
	
 }
	public static void main(String[] args) {
		// Multi level Inheritance
    
		City c=new City();
		c.countryName(); //calling parent class method
		c.stateName();  //calling child method
		c.cityName(); //calling bottom child method
	}

}