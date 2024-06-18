package package2;

public class Swift extends Maruti {
	//single level inheritance
	public void carModel() {
		System.out.println("The Car model is Swift");
	}
	public void Price(int p) {
		System.out.println("The Car model price is  " +p);
	}
public static void main(String[] args) {
	Swift s=new Swift();
	
	s.Company(); //calling parent method
	s.carModel(); //Calling child method
	s.Price(s.BasePrice); //calling child method and parent Variable
	
}
}
