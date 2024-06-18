package package2;



public class ApiAutomation extends Automation {

	public void api() {
		System.out.println("API Automation with RestAssured");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApiAutomation a=new ApiAutomation();
		a.m1(); //parent method
		a.api();
		
	}
}
